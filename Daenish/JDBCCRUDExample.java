import java.sql.*;
import java.util.Scanner;

public class JDBCCRUDExample {

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root"; // Change as needed
    static final String PASS = "";     // Change as needed

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Choose: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> insertStudent(conn, sc);
                    case 2 -> readStudents(conn);
                    case 3 -> updateStudent(conn, sc);
                    case 4 -> deleteStudent(conn, sc);
                    case 5 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert
    private static void insertStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) inserted.");
        }
    }

    // Read
    private static void readStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n-- Student Records --");
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Age: %d\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"));
            }
        }
    }

    // Update
    private static void updateStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Name: ");
        String name = sc.nextLine();
        System.out.print("Enter new Age: ");
        int age = sc.nextInt();

        String sql = "UPDATE students SET name=?, age=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) updated.");
        }
    }

    // Delete
    private static void deleteStudent(Connection conn, Scanner sc) throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " student(s) deleted.");
        }
    }
}
