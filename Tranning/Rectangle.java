


 class Rectangle
{

   public int length;
   public int breadth;
   public int height;
   
  public Rectangle(int l, int b, int h)
{
this.length = l;
this.breadth =b;
this.height = h;
}

public void display()
{

System.out.println(length*breadth*height);
}

}



class cuboid{
	public int l,b,h;


}


public class shape{
public static void main(String[] args)
   {
     Rectangle myVol = new Rectangle(5,4,21);
     myVol.display();
   }
}

