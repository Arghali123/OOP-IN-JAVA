import java.sql.*;

public class CreateDatabaseAndTable {
    public static void main(String[] args) {
        // Connection without selecting a database
        String url = "jdbc:mysql://localhost:3306/?useSSL=false";
        String user = "root";      // Replace with your username
        String pass = "";          // Replace with your password

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {

            // Create database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS student_db");
            System.out.println("Database created or already exists.");

            // Use the database
            stmt.execute("USE student_db");

            // Create table
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS students (
                    id INT PRIMARY KEY,
                    name VARCHAR(100),
                    address VARCHAR(255),
                    class VARCHAR(10),
                    gender VARCHAR(10),
                    shift VARCHAR(50),
                    remark TEXT
                )
            """;
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'students' created or already exists.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
