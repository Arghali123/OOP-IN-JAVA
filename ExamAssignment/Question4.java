/*
 Write a Java program that defines a Rectangle class with attributes
length and width. Implement the following functionalities:
a) Encapsulate the attributes with private access and provide getter
and setter methods.
b) Add a constructor that initializes the length and width with user
input.
c) Implement an area() method that calculates and returns the area of
the rectangle.
d) Implement a perimeter() method that calculates and returns the
perimeter of the rectangle.
e) Create multiple Rectangle objects and store them in an array.
f) Implement a method to find and display the rectangle with the
largest area.
g) Display the details of all rectangles after sorting them in
descending order of area.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Rectangle
{
  private float length;
  private float width;
  private float area;
  private float perimeter;

  protected static ArrayList <Rectangle> myArrayList=new ArrayList<>();
  public Rectangle(float length,float width,float area,float perimeter)
  {
    this.length=length;
    this.width=width;
    this.area=area;
    this.perimeter=perimeter;
    myArrayList.add(this);
  }

  
  public float getLength() {
    return length;
}


public void setLength(float length) {
    this.length = length;
}


public float getWidth() {
    return width;
}


public void setWidth(float width) {
    this.width = width;
}


public float getArea() {
    return area;
}


public void setArea(float area) {
    this.area = area;
}


public float getPerimeter() {
    return perimeter;
}


public void setPerimeter(float perimeter) {
    this.perimeter = perimeter;
}


public float area()
  {
    return length*width;
  }
  public float perimeter()
  {
    return 2*(length*width);
  }
  public void displayDetails()
  {
    System.out.println("length: "+length+" ,breath: "+width+" ,area: "+area+" ,perimter: "+perimeter);
  }


  //Sorting in descending order
  public static void sort()
  {
     int size=myArrayList.size();
     for(int i=0;i<size-1;i++)
     {
      for(int j=0;j<size-1-i;j++)
      {
        if(myArrayList.get(j).getArea()<myArrayList.get(j+1).getArea())
        {
          Rectangle temp=myArrayList.get(j);
          myArrayList.set(j, myArrayList.get(j+1));
          myArrayList.set(j+1, temp);
        }
      }
     }

  }

  //find largest
  public static void displayLargestRectangleDetails()
  {
    Rectangle largest=myArrayList.get(0);
    int size=myArrayList.size();
    for(int i=1;i<size;i++)
    {
      if(largest.getArea()<myArrayList.get(i).getArea())
      {
        largest=myArrayList.get(i);
      }
    }
    System.out.println("The Largest rectangle information!!");
    System.out.println("Area: "+largest.getArea()+" ,Perimeter: "+largest.getPerimeter());
  }



}
public class Question4 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter the number of Rectangle details: ");
        int n=myScanner.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details of rectangle"+(i+1));
            System.out.print("Enter the length: ");
            float length=myScanner.nextFloat();
            myScanner.nextLine();

            System.out.print("Enter the width: ");
            float width=myScanner.nextFloat();
            myScanner.nextLine();
            
            new Rectangle(length, width, length*width, 2*(length+width));
            System.out.println();
        }

        Rectangle.displayLargestRectangleDetails();
        Rectangle.sort();

        for(Rectangle val:Rectangle.myArrayList)
        {
            val.displayDetails();
        }
        
        myScanner.close();
    }
}