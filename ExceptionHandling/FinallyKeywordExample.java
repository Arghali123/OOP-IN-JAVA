public class FinallyKeywordExample {
    public static void main(String[] args) {
        try
        {
            int a=10;
            int b=0;
            int result=a/b;
            System.out.println(result);
        }catch(ArithmeticException e)
        {
            System.out.println("Cannot divide a number by zero");
            e.printStackTrace();
        }finally
        {
            System.out.println("finally block is always executed");

        }
        System.out.println("Rest of the code....");
    }
}
