import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class ReadData {
     public static final String JDBC_URL = "jdbc:mysql://localhost:3306/JavaDatabase";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";

    public static void main(String[] args) {
        try
        {
            //Establish connection
            Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);

            //Create statement
            Statement statement=connection.createStatement();

            String sqlQuery="""
            SELECT *FROM users
            """;

            ResultSet rs=statement.executeQuery(sqlQuery);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                System.out.println("Id: "+id+" ,Name: "+name+" ,Email: "+email);
            }
            statement.close();
            connection.close();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
