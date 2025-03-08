public class Outer {
    
    //Non-static class
    class Inner
    {
        void displayInnerClassDetails()
        {
            System.out.println("This is the instance of inner class");
        }
    }
    public static void main(String[] args) {
        Outer myOuter=new Outer();
        Outer.Inner myInner=myOuter.new Inner();
        myInner.displayInnerClassDetails();
    }
}
