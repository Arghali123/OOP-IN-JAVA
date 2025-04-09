 public class Test {
 
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            int result=a/b;
            System.out.println(result);
        }
        catch(ArithmeticException d)
        {
          System.out.println("cannot divide by zero");
          d.printStackTrace();
        }
        System.out.println("hell0");
    }
 }