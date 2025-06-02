import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Table {
    
    public static final String JDBC_URL="jdbc:mysql://localhost:3306/MyProject";
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="";
    public static void main(String[] args) {
        try
        {
            Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
            Statement statement=connection.createStatement();
            String sqlQuery="""
            CREATE TABLE ProjectTable(
            StudentID INT AUTO_INCREMENT PRIMARY KEY,
            StudentName VARCHAR(100) NOT NULL,
            ADDRESS VARCHAR(100) NOT NULL
            )""";
            statement.execute(sqlQuery);
            System.out.println("Table Created Success fully...");
            statement.close();
            connection.close();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
