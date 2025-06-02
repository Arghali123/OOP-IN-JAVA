/*
 * Define a Calculator class with an overloaded method add().
Implement different versions of add() that handle integers, doubles,
and three numbers.
 */
class Calculator
{
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b,double c)
    {
        return a+b+c;
    }
  
}
public class Question8 {
    public static void main(String[] args) {
       Calculator obj=new Calculator();

       int int_add_result=obj.add(1, 2, 3);
       System.out.println("The result in interger: "+int_add_result);

       double double_add_result=obj.add(4, 5,6);
       System.out.println("The result in double: "+double_add_result);
    }
}
