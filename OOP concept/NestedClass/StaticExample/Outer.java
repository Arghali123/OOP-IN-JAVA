//package StaticExample;

public class Outer {
    static void sayhello()
    {
        System.out.println("Hello world");
    }

    //Static class:by the help of static class we don't have to create objects to access.
    static class Inner
    {
       void displayInnerClassDetails()
       {
        System.out.println("The data is from inner class");
        sayhello();
       }
    }

    public static void main(String[] args) {
       Outer.Inner innerobj=new Outer.Inner();
       innerobj.displayInnerClassDetails();

        
    }
}
