class Parent
{
    void calling()
    {
        System.out.println("This is parent");
    }
}
class Child extends Parent
{
    void calling()
    {
        System.out.println("This is child");
    }
    void display()
    {
        this.calling();
        super.calling();
    }
}


public class SuperthisKeyword {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
    }
}
