package Exam;


import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int roll;
    float grade;
   
   static ArrayList<Student> records=new ArrayList<>();
    public Student(String name,int roll,float grade)
    {
        this.name=name;
        this.roll=roll;
        this.grade=grade;
        records.add(this);
    }

    public static void displayDetails()
    {
        for(int i=0;i<records.size();i++)
        {
            System.out.println("Name: "+records.get(i).name+" ,Roll: "+records.get(i).roll);
        }
    }

   public static void displayHighest()
   {
    Student highest=records.get(0);
     for(int i=1;i<records.size();i++)
     {
        if(highest.grade<records.get(i).grade)
        {
           highest=records.get(i);
        } 
     }
     System.out.println("Name: "+highest.name+", Grade: "+highest.grade);
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        System.out.println("Enter the info of 5 Students");
        for(int i=0;i<3;i++)
        {
          System.out.print("Enter name: ");
          String name=sc.nextLine();
        

          System.out.print("Enter roll: ");
          int roll=sc.nextInt();
          System.out.print("Enter grade: ");
          float grade=sc.nextFloat();
          sc.nextLine();
          new Student(name, roll, grade);
          System.out.println();
        }
        
        displayDetails();
        displayHighest();
        
        sc.close();

    }
}
