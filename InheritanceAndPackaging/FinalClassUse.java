//Using final to override method
/*class A 
{
    final void meth()
    {
        System.out.println("This is a final method");
    }
}

class B extends A 
{
    public void meth()//ERROR! Cannot override
    {
      System.out.println("Illigal");
    }
}
*/


//Using final to prevent Inheritance
/*final class A 
{

}
class B extends A //The following class is illegal
{
//ERROR! cannot subclass A
}
*/
public class FinalClassUse {
    public static void main(String[] args) {
        
    }
}
