//Write a java program to write three student
//information (Roll, Name, Address, College) into file student.txt and
//display the student information whose address is Jhapa.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        try
        {
           FileWriter writer=new FileWriter("Student.txt");
           Scanner sc=new Scanner(System.in);

        for(int i=1;i<=5;i++)
        {
            System.out.println("Enter the details for Student "+i);
            System.out.print("Enter rollno: ");
            int roll=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name=sc.nextLine();

            System.out.print("Enter address: ");
            String address=sc.nextLine();

            System.out.print("Enter collage name: ");
            String college=sc.nextLine();

            writer.write("Rollno: "+roll+" ,Name: "+name+" ,Address: "+address+" ,College: "+college+"\n");
        }
        writer.close();
        sc.close();
        System.out.println("Successfully Student data recorded.");
        }catch(IOException e)
        {
          System.out.println("Error Writing to file: "+e.getMessage());
        }

        //Read the file Student.txt and display the records of students who are from Jhapa
        System.out.println("Students from Jhapa");
        try
        {
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

        }catch(IOException e)
        {
            System.out.println("Error reading file: "+e.getMessage());
        }

        
       
    }
}
