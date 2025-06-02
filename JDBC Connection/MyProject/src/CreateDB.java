import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";
    public static String DB_NAME = "MyProject";

    public static void main(String[] args) {

        {
            try {
                Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                Statement statement = connection.createStatement();
                String sql = "CREATE DATABASE " + DB_NAME;
                statement.execute(sql);
                System.out.println("Database: " + DB_NAME + " created successfully");
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
