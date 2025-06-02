import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import Serialization.Student;

public class ReadStudentData {
    public static void main(String[] args) {
        try
        {
            FileInputStream fileIN=new FileInputStream("Students.ser");
            ObjectInputStream in=new ObjectInputStream(fileIN);

            System.out.println("Students from Bewora");
            for(int i=1;i<=5;i++)
            {
                Student s=(Student)in.readObject();
                if(s.getAddress().equalsIgnoreCase("Bewora"))
                {
                    s.display();
                }
            }
            in.close();
            fileIN.close();
        }catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
