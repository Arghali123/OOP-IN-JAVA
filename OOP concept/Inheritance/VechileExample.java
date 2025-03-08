package Inheritance;
//Parent class or super class
class Vechile
{
 void run()
 {
    System.out.println("Vechile is running");
 }
}

//Child class or sub class
class Car extends Vechile
{
  void stop()
  {
    System.out.println("Vechile is stoppped");
  }
}


public class VechileExample {
    public static void main(String[] args) {
        
        Car myCar=new Car();
        myCar.stop();
        myCar.run();//child class can access the property of parent;
    }
}
