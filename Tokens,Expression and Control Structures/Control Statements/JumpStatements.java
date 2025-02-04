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
    }
}
