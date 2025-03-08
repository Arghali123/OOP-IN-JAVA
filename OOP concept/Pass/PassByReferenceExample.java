//package Pass;
class Car
{
    String name;
    double price;
}


public class PassByReferenceExample {
 public static void main(String[] args) {
    Car myCar=new Car();
    myCar.name="Ferrari";
    myCar.price=1000000.00;
    System.out.println(myCar.name);
    System.out.println(myCar.price);

    Car secondCar=new Car();
    secondCar=myCar;
    System.out.println(secondCar.name);
    System.out.println(secondCar.price);

    secondCar.name="Mustang";
    secondCar.price=77777.21;
    System.out.println(secondCar.name);
    System.out.println(secondCar.price);

    System.out.println(myCar.name);
    System.out.println(myCar.price);
 }
}
