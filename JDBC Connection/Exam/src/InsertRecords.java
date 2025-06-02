import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertRecords {
    public static final String JDBC_URL="jdbc:mysql://localhost:3306/Examdatabase";
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="";

    public static void main(String[] args) {
        try
        {
            Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
            Statement statement=connection.createStatement();
            String sqlQuery="""
                  INSERT INTO student(id,name,email) VALUES
                  (1,"Daenish","arghaliDaenish@gail.com"),
                  (1,"Ayush","aayush@gmail.com")
                  
            """;
            statement.execute(sqlQuery);
            System.out.println("Records inserted successfully");
            statement.close();
            connection.close();

        }catch(SQLException e)
        {
          e.printStackTrace();
        }
      

    }
}
