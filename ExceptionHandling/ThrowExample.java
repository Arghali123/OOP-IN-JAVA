import CustomException.CustomErrorException;
//Throw: Used to make custom error message.
//finally:used vako resources clean garxa,ani exception huda ni nahuda ni kam garxa.
public class ThrowExample {
    public static void main(String[] args) {
        int number=-10;
        try
        {
          if(number<0)
          {
            throw new CustomErrorException("Number cannot be negative");
          }
          System.out.println("Valid number: "+number);
        }catch(Exception e)
        {
           System.out.println("Custom Error: "+e.getMessage());
        }finally
        {
          System.out.println("cleaning resouces...");
        }
    }
}
