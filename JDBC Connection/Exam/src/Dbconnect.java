import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";
    public static String DB_NAME = "Examdatabase";

    public static void main(String[] args) {
        try {
            // Connect to MySQL server
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

            // Create Statement object
            Statement statement = connection.createStatement();

            // Create database
            String sql = "CREATE DATABASE " + DB_NAME;
            statement.execute(sql);
            System.out.println("Database Created Successfully");

            // Clean up
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
