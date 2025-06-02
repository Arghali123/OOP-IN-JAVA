/*
Write a Java program to define a Student class with attributes name,
age, and pecentage. Implement the following functionalities:
a) Create an array of 5 Student objects, taking user input for each
student's details.
b) Implement a method to sort the students based on their percentage in
descending order.
c) Implement a method to find and display the student with the
highest grade.
d) Display all student details after sorting.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Student
{
  private String name;
  private int age;
  double percentage;

  protected static ArrayList<Student> studentsList=new ArrayList<>();

  public Student(String name,int age,double percentage)
  {
    this.name=name;
    this.age=age;
    this.percentage=percentage;
    studentsList.add(this);
  }

  public static void sort()
  {
     int n=studentsList.size();
     for(int i=0;i<n-1;i++)
     {
        for(int j=0;j<n-i-1;j++)
        {
            if(studentsList.get(j).percentage<studentsList.get(j+1).percentage)
            {
              Student temp=studentsList.get(j);
              studentsList.set(j,studentsList.get(j+1));
              studentsList.set(j+1, temp);
            }
        }
     }
  }

  public void displayStudentsDetails()
  {
    System.out.println("Student name: "+name+" ,age: "+age+" ,percentage: "+percentage);
  }
  public static void highestPercentageHolder()
  {
    Student highest=studentsList.get(0);
    for(int i=0;i<studentsList.size();i++)
    {
        if(highest.percentage<studentsList.get(i).percentage)
        {
            highest=studentsList.get(i);
        }
    }
    System.out.println();
    System.out.println("Topper student name: "+highest.name+" and percentage scored: "+highest.percentage);
  }

}
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the details of 5 students");
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the details of Student"+(i+1));
            
            System.out.print("Enter name: ");
            String name=scanner.nextLine();

            System.out.print("Enter age: ");
            int age=scanner.nextInt();

            System.out.print("Enter percentage: ");
            double pecentage=scanner.nextDouble();
            scanner.nextLine();

            System.out.println();
            new Student(name, age, pecentage);
        }
        Student.sort();
        for(Student val:Student.studentsList)
        {
            val.displayStudentsDetails();
        }
        Student.highestPercentageHolder();

        scanner.close();
    }
}
