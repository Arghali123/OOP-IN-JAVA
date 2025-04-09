package Polymorphism;
public class OverLoading
{
    int add(int a,int b)
    {
        return a+b;
    }

    double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
      OverLoading obj=new OverLoading();
      System.out.println("First method: "+obj.add(10, 5));
      System.out.println("Second method: "+obj.add(11.00, 11.00));
      System.out.println("Third method: "+obj.add(10, 5,25));
    }
}