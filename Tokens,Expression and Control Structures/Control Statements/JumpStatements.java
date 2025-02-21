public class JumpStatements {
    public static void main(String[] args) {
        //1.)break statement:
        for(int i=0;i<=10;i++)
        {
           System.out.println(i);
           if(i==4)
           break;
        }
        System.out.println("Loop completed!!.");
      
        //Continue Statement:
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.print(i+" ");
        }
   
    }
}
