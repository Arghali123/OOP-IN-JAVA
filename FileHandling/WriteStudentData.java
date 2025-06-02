import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import Serialization.Student;

public class WriteStudentData {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try
    {
      FileOutputStream fileout=new FileOutputStream("Students.ser");
      ObjectOutputStream out=new ObjectOutputStream(fileout);

      for(int i=1;i<=5;i++)
      {
        System.out.println("Enter the details of student "+i);
        System.out.print("Enter name: ");
        String name=sc.nextLine();

        System.out.print("Roll no: ");
        int Roll=Integer.parseInt(sc.nextLine());

        System.out.print("Address: ");
        String address=sc.nextLine();

        Student s=new Student(Roll, name, address);
        out.writeObject(s);//Serialize the student object
      }
      out.close();
      fileout.close();
      sc.close();
      System.out.println("Record saved successfully");
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}