/*
 Implement a class Person with attributes name and age. Derive a class
Employee from Person and add salary. Demonstrate calling the parent
class constructor.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Person
{
    private String name;
    private int age;

    public Person(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}

class Employee extends Person
{
   public float salary;

   public Employee(String name,int age,float salary)
   {
    super(name, age);
    this.salary=salary;
   }

   public float getSalary()
   {
    return salary;
   }
   public void setSalary(float salary)
   {
    this.salary=salary;
   }

   public void displayDetails()
   {
    System.out.println("Emoloyee name: "+getName()+" ,Employee age: "+getAge()+" Employee salary: "+getSalary());
   }
}
public class Question6 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        ArrayList <Employee> empArrayList=new ArrayList<>();

        System.out.print("Enter the number of employees deatils you want to add: ");
        int n=myScanner.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of employee"+(i+1));
            myScanner.nextLine();
            
            System.out.print("Enter name: ");
            String name=myScanner.nextLine();

            System.out.print("Enter age: ");
            int age=myScanner.nextInt();

            System.out.print("Enter salary: ");
            float salary=myScanner.nextFloat();

            System.out.println();
            empArrayList.add(new Employee(name, age, salary));
        }

        for(Employee val:empArrayList)
        {
            val.displayDetails();
        }
        myScanner.close();
    }
}
