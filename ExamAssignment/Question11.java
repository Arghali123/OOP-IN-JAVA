/*
 Implement a base class Vehicle with a display() method. Use super.display() inside a subclass Car to call the parent class method.
 */
class Vehicle 
{
    void display()
    {
      System.out.println("Hello this is the method from the parent class Vechile");
    }
}
class Car extends Vehicle
{
    @Override
    void display()
    {
        System.out.println("Hello this is the method from the child class Car");
    }
    void printAll()
    {
        super.display();
        this.display();
    }
}
public class Question11 {
    public static void main(String[] args) {
        Car car=new Car();
        car.printAll();
    }
}
