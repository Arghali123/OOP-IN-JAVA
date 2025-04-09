package Interface;
interface Father
{
    //public, static and final
 final int a=10;

 //public and abstract
 void oi();
}

class Son implements Father
{
    public void oi()
    {
        System.out.println("Hey i am from child class and using the method of father");
    }
}
public class Interface_P1 {
    public static void main(String[] args) {
        Son son=new Son();
        son.oi();
        System.out.println(son.a);
    }
}
