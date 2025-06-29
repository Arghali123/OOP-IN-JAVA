package NestedClass.StaticExample;

public class StaticNested {
    static int staticVar=12;
    static class displayInnerClass
    {
        void display()
        {
            System.out.println("Static var from outer: "+staticVar);
        }
    }
    public static void main(String[] args) {
         StaticNested.displayInnerClass obj=new StaticNested.displayInnerClass();
         obj.display();

    }
}
