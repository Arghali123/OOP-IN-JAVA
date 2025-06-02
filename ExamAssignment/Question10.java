/*
 Write a program where a superclass method is overridden in a subclass, and the subclass method calls the superclass method using super.
 */
class Parent
{
    void writing()
    {
        System.out.println("Parent is writing");
    }
    void eating()
    {
        System.out.println("Parent is eating");
    }
}
class Child extends Parent
{
    @Override
    void writing()
    {
        System.out.println("Child is writing");
    }

    @Override
   void eating()
   {
    System.out.println("Child is eating");
   }

   void displayMethods()
   {
    super.writing();
    super.eating();
    this.writing();
    this.eating();
   }
}
public class Question10 {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.displayMethods();
    }
}
