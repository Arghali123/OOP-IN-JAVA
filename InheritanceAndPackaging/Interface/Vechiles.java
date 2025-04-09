interface Vechile
{
    void changeGear(int a);
    void speedUp(int a);
    void applyBreak(int a);
}

class Bicycle implements Vechile
{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear)
    {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment)
    {
        speed=speed+increment;
    }

    @Override
    public void applyBreak(int decrement)
    {
        speed=speed-decrement;
    }

    public void printStates()
    {
        System.out.println("Speed: "+speed+" ,Gear: "+gear);
    }
}

class Bike implements Vechile
{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear)
    {
        gear=newGear;
    }

    @Override
    public void speedUp(int increment)
    {
        speed=speed+increment;
    }

    @Override
    public void applyBreak(int decrement)
    {
        speed=speed-decrement;
    }

    public void printStates()
    {
        System.out.println("Speed: "+speed+" ,Gear: "+gear);
    }
}
public class Vechiles {
   public static void main(String[] args) {
    Bicycle bicycle=new Bicycle();
    bicycle.changeGear(2);
    bicycle.speedUp(3);
    bicycle.applyBreak(1);
    System.out.print("Bicycle present state: ");
    bicycle.printStates();

    Bike bike=new Bike();
    bike.changeGear(3);
    bike.speedUp(4);
    bike.applyBreak(2);
    System.out.print("Bike present state: ");
    bike.printStates();
   } 
}
