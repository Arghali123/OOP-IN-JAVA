import java.util.HashMap;

class Student
{
    String name;
    int id;

    Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public String toString()
    {
        return name+" ("+id+" )";
    }
}
public class HashClass {
    public static void main(String[] args) {

      //create a hash Table
      HashMap<Student,String> studentGrades=new HashMap<>();

      Student s1=new Student("Daenish", 10);
      Student s2=new Student("Niraj", 18);

      studentGrades.put(s1, "A");
      studentGrades.put(s2, "B");

      //Print the values
      System.out.println(studentGrades.get(s1));
      System.out.println(studentGrades.get(s2));

      System.out.println(studentGrades);

    }
}
