//accessing the members of outer class within inner class
public class Car {

    String carName;
    String CarType;

    //Assign Values using constructor
    public Car(String name,String type)
    {
        this.carName=name;
        this.CarType=type;
    }

    private String getCarName()
    {
        return this.carName;
    }

    //Inner Class
    class Engine
    {
        String  engineType;

        void setEngine()
        {
            if(Car.this.CarType.equals("4WD"))
            {
                //Invoking method getName() of Car
                if(Car.this.getCarName().equals("Crysler"))
                {
                    this.engineType="Smaller";
                }else
                {
                    this.engineType="Bigger";
                }
            }else
            {
                this.engineType="Bigger";
            }
        }

        String getEngineType()
        {
            return this.engineType;
        }
    }

    public void displayDetails()
    {
      Engine engine=this.new Engine();
      engine.setEngine();

      System.out.println("Car Name: "+this.carName);
      System.out.println("Car Type: "+this.CarType);
      System.out.println("Engine Type: "+engine.getEngineType());
    }
    public static void main(String[] args) {
        Car car1=new Car("Mazda", "8WD");
        Car car2=new Car("Crysler", "4WD");
        Car car3=new Car("BMW", "4WD");

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}