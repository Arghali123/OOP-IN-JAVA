/*
 Write a program to demonstrate the use of this keyword.
 */
class Person
{
    String name;
    int age;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String get_name()
    {
        return name;
    }
    public void change_name(String name)
    {
        this.name=name;
    }

    public void printDetails()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println();
    }
}
public class Question12 {
    public static void main(String[] args) {
        Person first=new Person("Aman", 20);
        Person second=new Person("Puran",21);

        first.printDetails();
        second.printDetails();

        first.change_name("Daenish");
        first.printDetails();
    }
}
