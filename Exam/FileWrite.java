import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        try
        {
            FileWriter writer=new FileWriter("Student.txt");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter details for Student "+(i+1));
            System.out.print("Enter roll: ");
            int roll=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name=sc.nextLine();
            

            System.out.print("Enter address: ");
            String address=sc.nextLine();


            System.out.print("Enter college: ");
            String college=sc.nextLine();
            

            writer.write("Rollno: "+roll+" ,Name: "+name+" ,Address: "+address+" ,College: "+college+"\n");
            System.out.println();   
        }
        writer.close();
        sc.close();
        System.out.println("Data written successfully to Student.txt");

        //Read from the file and display the students from Jhapa
        System.out.println("Students from Jhapa");
        BufferedReader reader=new BufferedReader(new FileReader("Student.txt"));
        String line;

        while((line=reader.readLine())!=null)
        {
          if(line.toLowerCase().contains("address: jhapa"))
          {
            System.out.println(line);
          }
        }
        reader.close();
        }catch(Exception e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
      
    }
}
