public class JumpStatements {
    public static void main(String[] args) {
        //1.)break statement:
        for(int i=0;i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            else
            {
                System.out.println("i: "+i);
            }
        }
        System.out.println("Loop completed!!.");

        //2.)Continue Statement:
        for (int i = 0; i < 10; i++) {
          
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }
        System.out.println();

        //3.)return Statement:
        boolean t=true;
        System.out.println("Before the return.");
        if(t)
        return;

        //Compiler will bypass every statement after return.
    }
}
