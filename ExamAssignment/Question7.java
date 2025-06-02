/*
 * Create a base class Shape with a method area(). Implement the following functionalities:
a) Inherit Circle and Square from Shape, where each class overrides the area() method to calculate and return the respective area.
b) Implement constructor overloading in both Circle and Square to initialize objects either with default values or user-specified
values.
c) Create a ShapeManager class that:
i. Stores multiple Shape objects (both Circle and Square) in an array.
ii. Implements a method to find the shape with the largest area and display its type (Circle or Square) along with its area.
iii. Implements a method to sort all shapes in descending order of area and display their details.
 */

import java.util.ArrayList;

abstract class Shape
{
    public abstract double area();
}

class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        this.radius=1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString()
    {
        return "Circle with radius: "+radius+" ,Area: "+area();
    }
}

class Square extends Shape
{
    private double length;

    public Square()
    {
        this.length=1.0;
    }
    public Square(double length)
    {
        this.length=length;
    }

    @Override 
    public double area()
    {
        return length*length;
    }

    @Override
    public String toString()
    {
        return "Square length: "+length+" ,Area: "+area();
    }
}

class ShapeManager
{
   private ArrayList<Shape> shapes;
   
   public ShapeManager()
   {
    this.shapes=new ArrayList<>();
    //Before using shapes, we must initialize it, or it will be null, causing errors.
   }

   //Method to add shape
   public void addShapes(Shape shape)
   {
    shapes.add(shape);
   }

   //Find the shape with the largest area
   public void largestShapeArea()
   {
    if(shapes.isEmpty())
    {
        System.out.println("No shapes information in the shapes list");
        return;
    }
    Shape largest=shapes.get(0);
    for(int i=1;i<shapes.size();i++)
    {
        if(largest.area()>shapes.get(i).area())
        {
          largest=shapes.get(i);
        }
    }
    System.out.println("The largest shape: "+largest);
    //In Java, when you try to print an object, Java automatically calls its toString() method.f
   }

   //Sort shapes in descending order of area
   public void sort()
   {
     int n=shapes.size();
     for(int i=0;i<n-1;i++)
     {
        for(int j=0;j<n-1-i;j++)
        {
            if(shapes.get(j).area()<shapes.get(j+1).area())
            {
                Shape temp=shapes.get(j);
                shapes.set(j,shapes.get(j+1));
                shapes.set(j+1,temp);
            }
        }
     }
   }

   public void displayShapesDetails()
   {
     for(Shape val:shapes)
     {
        System.out.println(val+" ");
     }
   }
}
public class Question7 {
    public static void main(String[] args) {
        ShapeManager manager=new ShapeManager();
        manager.addShapes(new Circle(5));
        manager.addShapes(new Square(4));
        manager.addShapes(new Circle(3));
        manager.addShapes(new Square(6));

        manager.largestShapeArea();
        manager.sort();
        manager.displayShapesDetails();
    }
}
