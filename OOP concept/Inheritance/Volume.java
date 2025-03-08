package Inheritance;

//Parent class
class Shape
{
 int length;
 int breadth;
 int height;
}

//child class
class Cube extends Shape
{
  void CubeVol()
  {
    System.out.println("The cube volume is: "+(length*length*length));
  }
}

//child class
class Cuboid extends Shape
{
  void CuboidVol()
  {
    System.out.println("The cuboid volume is: "+(length*breadth*height));
  }
}


public class Volume {
    public static void main(String[] args) {
    //    Shape myShape=new Shape();
    //    myShape.length=5;
    //    myShape.breadth=10;
    //    myShape.height=15;

        Cube myCube=new Cube();
        myCube.length=5;
        myCube.CubeVol();

        Cuboid myCuboid=new Cuboid();
        myCuboid.length=7;
        myCuboid.breadth=7;
        myCuboid.height=7;
        myCuboid.CuboidVol();

        
    }
}
