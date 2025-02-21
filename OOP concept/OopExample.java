//defining a class name Car
class Car{
    //Fields or data members or attributes
    String brand;
    int speed;


    //Method
    void displayCarDetails()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed+" km/hr");
    }
}

public class OopExample {
    public static void main(String[] args) {
        //creating objects of Car class
        Car car1=new Car();
        Car car2=new Car();
        //Assiging values to attributes
        car1.brand="Buggati";
        car1.speed=400;
        car1.displayCarDetails();

        car2.brand="Lamborgini";
        car2.speed=90;
        car2.displayCarDetails();
    }
}

