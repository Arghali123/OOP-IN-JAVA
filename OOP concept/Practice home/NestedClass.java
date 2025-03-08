public class NestedClass {
    static void display()
    {
        System.out.println("Hey i am instance of parent");
    }

    static class Subclass
    {
        void display()
        {
            System.out.println("This is the instance from child");
        }
    }
    public static void main(String[] args) {
        NestedClass.Subclass mySubclass=new NestedClass.Subclass();
        mySubclass.display();
    }
}
