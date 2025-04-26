//throws: kasto khalko exceptions auena sakxa pahilai notify garna kam garxa.Doesnot handles exceptions.
public class ThrowsKeywordExample {
    public static int divide (int a,int b) throws ArithmeticException
    {
        return a/b;
    }
    public static void main(String[] args) {
        try{
            int result=divide(1, 0);
            System.out.println(result);
        }
        catch(Exception e)
        {
          System.out.println("Cannot divide by zero.");
        }
    }
}
