class Parent
{
    int number=100;
    Parent()
    {
        System.out.println("Parent class constructor called.");
    }

    void otherMethod()
    {
        System.out.println("Parent other method called.");
    }

    void secondMethod()
    {
        System.out.println("Parent second method.");
    }
}
class Child extends Parent
{
    int number=200;
    void display()
    {
        super.otherMethod();
        System.out.println("Parent class number: "+super.number);
        System.out.println("Child class number: "+this.number);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Child childobj=new Child();
        childobj.display();
    }
}
