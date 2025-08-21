import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteStudents 
{
    public static void main(String[] args) 
    {
       ArrayList<Student> studentList=new ArrayList<>();
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the number of Students: ");
       int n=sc.nextInt();

       for(int i=0;i<n;i++)
       {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();

            studentList.add(new Student(id, name));
       }

       try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student_list.ser")))
       {
        oos.writeObject(studentList);
        System.out.println("All students records saved successfully");
       }catch(IOException e)
       {
        e.printStackTrace();
       }
       sc.close();
    }
}
