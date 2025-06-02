/*
Write a program to implement constructor overloading in a class Student with different constructors for initializing name, name & age,
and all attributes.
 */
class Student
{
    String name;
    int age;
    int rollno;

    public Student(String name)
    {
        this.name=name;
    }
    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Student(String name,int age,int roll)
    {
        this.name=name;
        this.age=age;
        this.rollno=roll;
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
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    
}
public class Question13 {
    public static void main(String[] args) {
        Student std1=new Student("Daenish");
        Student std2=new Student("Niraj", 18);
        Student std3=new Student("Ayush", 21, 1);

        System.out.println("Student1 name: "+std1.getName());
        System.out.println("Student2 name: "+std2.getName()+" ,Age: "+std2.getAge());
        System.out.println("Student3 name: "+std3.getName()+" ,age: "+std3.getAge()+" ,Roll no: "+std3.getRollno());
    }
}
