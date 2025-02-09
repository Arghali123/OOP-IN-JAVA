import java.util.Scanner;
public class LoopingStatement {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=myObj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+(num*i));
        }
        System.out.println();
        System.out.print("Enter second number: ");
        int nextNum=myObj.nextInt();
        if(nextNum%2==0)
        {
            System.out.print("The number is even: "+nextNum );
        }
        else
        {
            System.out.println("The number is odd: "+nextNum);
        }
        myObj.close();
    }
}
