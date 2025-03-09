// class Car {
//     // Instance variabes(fields)
//     String make;
//     String model;
//     int year;

//     // Constructor
//     public Car(String make, String model, int year) {
//         // 'this' refer's to the current object
//         this.make = make;
//         this.model = model;
//         this.year = year;
//         System.out.println("A new Car object has been created");

//     }

//     public void display() {
//         System.out.println("Make: " + make);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }

// class Rectangle
// {
//     double length,breadth,area;

//     public Rectangle(double length,double breadth)
//     {
//       this.length=length;
//       this.breadth=breadth;
//     }
    
//     public void displayArea()
//     {
//         area=length*breadth;
//         System.out.println("Area of rectangle: "+area);
//     }
// }

// Main function
public class ParameterizedConstructor {

    //data members
    int length;
    int breadth;
    ParameterizedConstructor(int length,int breadth)
    {
      this.length=length;
      this.breadth=breadth;
    }

    void displayDetails()
    {
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
    public static void main(String[] args) {
        // Creating a Car object using the Constructor
        // Car myCar = new Car("Toyota", "Camry", 2020);
        // myCar.display();

        // Rectangle myrect=new Rectangle(5, 10);
        // myrect.displayArea();


        ParameterizedConstructor myParameterizedConstructor=new ParameterizedConstructor(10, 20);
        myParameterizedConstructor.displayDetails();
    }

}
