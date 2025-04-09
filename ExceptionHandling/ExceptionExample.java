//import java.nio.file.attribute.AclFileAttributeView;

public class ExceptionExample {

    public static void main(String[] args) {
        int a=-1;
        int b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }
       
        System.out.println("after...");
    }
}