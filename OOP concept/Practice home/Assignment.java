//2.)Create a Student class with attributes name,rollno and marks.Add a method calculateGrade() that returns grade based on the marks obtained.

import java.util.Scanner;

class Student
{
    String name;
    int rollno;
    float percentage;
    
    //Constructor
    Student(String name,int rollno,float percentage)
    {
      this.name=name;
      this.rollno=rollno;
      this.percentage=percentage;
    }
    void calculateGrade()
    {
       if(percentage<59)
       {
        System.out.println("Hello "+name+" your rollno is "+rollno+" ,you got "+percentage+" you got failed.");
       }
       else if(percentage>=60 && percentage<69)
       {
        System.out.println("Hello "+name+" your rollno is "+rollno+" ,you got "+percentage+" you got D grade.");
       }
       else if(percentage>=70 && percentage<79)
       {
        System.out.println("Hello "+name+" your rollno is "+rollno+" ,you got "+percentage+" you got C grade.");
       }
       else if(percentage>=80 && percentage<89)
       {
        System.out.println("Hello "+name+" your rollno is "+rollno+" ,you got "+percentage+" you got B grade.");
       }
       else if(percentage>=90 && percentage<=100)
       {
        System.out.println("Hello "+name+" your rollno is "+rollno+" ,you got "+percentage+" you got A grade.");
       }
       else
       {
        System.out.println("Impossible");
       }
    }
}


//Main function
public class Assignment {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=myScanner.nextLine();

        System.out.print("Enter your rollno: ");
        int rollno=myScanner.nextInt();

        int[] marks=new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
          System.out.print("Enter marks in "+(i+1)+" subject: ");
          marks[i]=myScanner.nextInt();
          sum+=marks[i];
        }
        float percentage=((float)sum/250)*100;
        System.out.println(percentage);

        Student myStudent=new Student(name, rollno, percentage);
        myStudent.calculateGrade();

        myScanner.close();
    }
}
