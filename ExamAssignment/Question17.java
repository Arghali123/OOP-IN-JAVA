/*
Sort an Array of Objects:
 -Create a Student class with attributes name and marks. Sort an array of Student objects in descending order of marks.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student
{
  int rollno;
  String name;
  int[] marks=new int[5];
  double percentage;
  static ArrayList<Student> students=new ArrayList<>();

  Student(int rollno,String name,int[] marks)
  {
    this.rollno=rollno;
    this.name=name;
    this.marks=marks;
    this.percentage=calculatePercentage();
  }

  private double calculatePercentage()
  {
    int total=0;
    for(int mark:marks)
    {
      total+=mark;
    }
    return (total/250.0)*100;
  }

  public void display()
  {
    System.out.println("Roll No: "+rollno);
    System.out.println("Name: "+name);
    System.out.println("Marks: "+Arrays.toString(marks));
    System.out.println("Pecentage: "+percentage+"%\n");
  }

  //Using bubble sorting
  public static void sorting()
  {
    int size=students.size();
    for(int i=0;i<size-1;i++)
    {
      for(int j=0;j<size-i-1;j++)
      {
        if(students.get(j).percentage<students.get(j+1).percentage)
        {
          Student temp=students.get(j);
          students.set(j,students.get(j+1));
          students.set(j+1, temp);
        }
      }
    }
  }

  public static boolean removeStuent(int rollno,String name)
  {
    for(int i=0;i<students.size();i++)
    {
      Student s=students.get(i);
      if(s.rollno==rollno && s.name.equalsIgnoreCase(name))
      {
        students.remove(i);
        return true;
      }
    }
    return false;
  }
}
public class Question17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the details of 3 students!!");
        for(int i=0;i<3;i++)
        {
          System.out.println("Enter the details of Student"+(i+1));
          System.err.print("Enter the roll no: ");
          int rollno=scanner.nextInt();
          scanner.nextLine();

          System.out.print("Enter the name: ");
          String name=scanner.nextLine();
          //scanner.nextLine();

          int[] marks=new int[5];
          System.out.println("Enter the marks in 5 Subjects!!");
          for(int j=0;j<5;j++)
          {
            marks[j]=scanner.nextInt();
          }
          scanner.nextLine();

          Student.students.add(new Student(rollno, name, marks));
        }

        Student.sorting();

        System.out.println("Student details after sorting!!");
        for(Student student:Student.students)
        {
          student.display();
        }

        //Ask user to remove a student details
        System.out.print("Enter the roll no of student to be removed: ");
        int removeRoll=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the name  of the student to be removed: ");
        String removeName=scanner.nextLine();

        boolean removed=Student.removeStuent(removeRoll, removeName);
        if(removed)
        {
          System.out.println("Student removed sucessfully!!");
        }else
        {
          System.out.println("Student not found");
        }

        //Display updated list
        System.out.println("Updated Student List.");
        for(Student student:Student.students)
        {
          student.display();
        }

        scanner.close();
    }
}
