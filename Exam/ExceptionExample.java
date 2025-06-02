public class ExceptionExample {

    public static void main(String[] args) {
        //Example of NullPointerException
        try
        {
            String str=null;
            System.out.println("Length of String: "+str.length());
        }catch(NullPointerException e)
        {
            System.out.println("Caught NullPointerException: "+e.getMessage());
        }

        //Example of NumberFormatException
        try
        {
            String num="abc";
            int number=Integer.parseInt(num);
            System.out.println("Converted Number: "+number);
        }catch(NumberFormatException e)
        {
            System.out.println("Caught NumberFormatExeception: "+e.getMessage());
        }

        finally
        {
            System.out.println("Execution Completed!");
        }
    }
}