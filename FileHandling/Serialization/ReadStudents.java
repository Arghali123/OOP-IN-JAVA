import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadStudents 
{
    public static void main(String[] args) 
    {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student_list.ser")))
        {
          ArrayList<Student> studentList=(ArrayList<Student>)ois.readObject();

          System.out.println("Students record: ");
          for(Student s:studentList)
          {
            System.out.println("ID: "+s.id+" ,Name: "+s.name);
          }
        }catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
