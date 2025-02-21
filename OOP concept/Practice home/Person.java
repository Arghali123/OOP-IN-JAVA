import java.util.Scanner;

public class Person {
    //Data members
    String name;
    int age;
    char gender;
    float salary;
    Person(String name,int age,float salary,char gender)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.gender=gender;

    }
    void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Gender: "+gender);
    }

    public static void main(String[] args) {

         Scanner myScanner=new Scanner(System.in);
         System.out.print("Enter your name: ");
         String name=myScanner.nextLine();

         System.out.print("Enter age: ");
         int age=myScanner.nextInt();

         System.out.print("Enter salary: ");
         float salary=myScanner.nextFloat();

         System.out.print("Enter gender: ");
         char gender=myScanner.next().charAt(0);

         Person myobj=new Person(name,age,salary,gender);
         myobj.displayInfo();

         myScanner.close();
    }
}
