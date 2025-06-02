import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/JavaDatabase";
    public static final String JBBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";

    public static void main(String[] args) {
        try {
            // extablisg cinnection 
            Connection connection = DriverManager.getConnection(JDBC_URL, JBBC_USERNAME, JDBC_PASSWORD);

            // create a statement 
            Statement statement = connection.createStatement();

            // SQL query to create a table
            String sqlQuery = """
                    CREATE TABLE users (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        email VARCHAR(150)
                        )
                    """;
                    // Execute Query 

                    statement.executeUpdate(sqlQuery);

                    // print the result
                    System.out.println("Table created successfully...");

                    // close resources 
                    statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
}
}
}
