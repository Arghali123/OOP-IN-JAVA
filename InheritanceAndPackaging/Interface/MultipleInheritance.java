package Interface;
interface Parent1
{
    void display1();
}
interface Parent2
{
    void display2();
}

class A 
{
    void display3()
    {
        System.out.println("I am inside class");
    }
}
class B extends A implements Parent1,Parent2
{
    public void display1()
    {
        System.out.println("I am inside interface1");
    }
    public void display2()
    {
        System.out.println("I a inside interface2");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
