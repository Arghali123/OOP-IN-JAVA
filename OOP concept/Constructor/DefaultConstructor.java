class Cuboid
{
    //Instance variables(fields)
    double l,b,h,vol;

    //Default constructor
    Cuboid()
    {
        l=10;
        b=5;
        h=3.3;
    }
    void display()
    {
        vol=l*b*h;
        System.out.println("Volume of cuboid: "+vol);
    }
}


//Main function
public class DefaultConstructor {
    public static void main(String[] args) {
        Cuboid myCuboid=new Cuboid();
        myCuboid.display();
    }
}
