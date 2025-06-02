import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadRecords {
    public static final String JDBC_URL="jdbc:sql://localhost:3305/Examdatabase";
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="";
    public static void main(String[] args) {
        try
    {
        Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
        Statement statement=connection.createStatement();
        String sqlQuery="""
            SELECT * FROM student
        """ ;  
         ResultSet rs=statement.executeQuery(sqlQuery);
         while(rs.next())
         {
            int id=rs.getInt("Id");
            String name=rs.getString("Name");
            String email=rs.getString("Email");
            System.out.println("Id: "+id+" ,Name: "+name+" ,Email: "+email);
         }

    statement.close();
    connection.close();

    }catch(SQLException e){
      e.printStackTrace();
    }
    
    
}
}
