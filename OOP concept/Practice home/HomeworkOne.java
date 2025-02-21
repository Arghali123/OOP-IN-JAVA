// package Practice home;

import java.util.Scanner;

class Cube
{
    float lenght;
    void displayVolCube()
    {
        System.out.println("The volume of edges: "+(lenght*lenght*lenght));
    }
}

class Cuboid
{
    float l,b,h;
    //float result=l*b*h;
    void displayVolCuboid()
    {
        System.out.println("The volume of cuboid: "+(l*b*h));
    }
}
public class HomeworkOne {
public static void main(String[] args) {
    Scanner myScanner=new Scanner(System.in);
    Cube myCube=new Cube();
    myCube.lenght=12.21f;
    myCube.displayVolCube();

    Cuboid myCuboid=new Cuboid();
    myCuboid.l=10.0f;
    myCuboid.b=11.0f;
    myCuboid.h=12.0f;
    myCuboid.displayVolCuboid();

    
    
}


}
