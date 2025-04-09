// final class First
// {
//     void firstMethod()
//     {
//         System.out.println("First method called!");
//     }
// }
// class Second extends First
// {
//     void secondMethod()
//     {
//         System.out.println("Second method called!!");
//     }
// }

class Person
{
    String name="Gokarna";
    final double salary=170000.0;

}
class Child extends Person
{
  void display()
  {
    System.out.println("Child name: "+name);
    System.out.println("Parenr salary"+salary);
  }
} 

public class FinalClassExamle {
    public static void main(String[] args) {
        // final String name="daenish";
        // System.out.println(name);
        // Second second=new Second();
        // second.secondMethod();
        // second.firstMethod();

        Child child=new Child();
        child.display();
        child.name="daenish";
        //child.salary="1200000.";

    }
}
