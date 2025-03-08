//Accessing members of outer class within Inner class
class Car {

    String carName;
    String carType;

    // Assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // Private method
    private String getCarName() {
        return this.carName;
    }

    // Inner class
    class Engine {
        String enginetype;

        void setEngine() {
            if (Car.this.carType.equals("4WD")) {
                // Invoking method getCarName() of Car
                if (Car.this.getCarName().equals("Crysler")) {
                    this.enginetype = "Smaller";
                } else {
                    this.enginetype = "Bigger";
                     }
            } else {
                this.enginetype = "Bigger";
            }

        }

        String getEngineType() {
            return this.enginetype;
        }
    }

    public static void main(String[] args) {
        Car car1=new Car("Mazda", "8WD");
        //Creating an object of inner class using the outer class
        Car.Engine engine=car1.new Engine();
        engine.setEngine();
        System.out.println("Engine type for 8WD: "+engine.getEngineType());

        Car car2=new Car("Crysler", "4WD");
        Car.Engine c2Engine=car2.new Engine();
        c2Engine.setEngine();;
        System.out.println("Engine type for 4WD: "+c2Engine.getEngineType());
    }

}