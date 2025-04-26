import CustomException.CustomErrExcPractice;

public class ThowUse {
 
    
    public static void main(String[] args)
    {
        int age=12;
      try
      {
        if(age<18)
        {
            throw new CustomErrExcPractice("Hello i am making an custom exception");
        }
        System.out.println("You can vote");
      }catch(Exception e)
      {
        System.out.println("Custom error made by me: "+e.getMessage());
      } 
    }
}
