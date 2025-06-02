import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {

    public static final String JDBC_URL="jdbc:mysql://localhost:3306";
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="";
    public static String DB_NAME="JavaDatabase";


    public static void main(String[] args) {
        try
        {
            //Establish connection
            Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);

            //create statement
            Statement statement=connection.createStatement();

            //SQL query to create database
            String sql="CREATE DATABASE "+DB_NAME;

            //execute queries
            statement.execute(sql);

            System.out.println("Database: "+DB_NAME+" created successfully.");

            //close refrences
            statement.close();
            connection.close();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }


    }

}