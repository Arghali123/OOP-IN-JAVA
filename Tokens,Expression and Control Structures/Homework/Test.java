import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.)Java program to find the Simple interest by asking the inputs from the user.

        Scanner myscanner=new Scanner(System.in);
        // System.out.println("Enter the Priciple: ");
        // float p=myscanner.nextFloat();
        // System.out.println("Enter the rate of interest: ");
        // float r=myscanner.nextFloat();
        // System.out.println("Enter the time: ");
        // float t=myscanner.nextFloat();
        // float si=(p*r*t)/100;
        // System.out.println("The simple interest: "+si);

        //2.)Java program to make a baisic calculator
        int a=30;
        int b=5;
        System.out.print("Enter the operation to be performed: ");
        char choose=myscanner.next().charAt(0);
        int result;
        switch(choose)
        {
            case '+':
             result=a+b;
            System.out.println("Addition: "+result);
            break;

            case '-':
             result=a-b;
            System.out.println("Subtraction: "+result);
            break;

            case '*':
             result=a*b;
            System.out.println("Multiplication: "+result);
            break;

            case '/':
             result=a/b;
            System.out.println("Division: "+result);
            break;

            default:
            System.out.println("Invalid option!!");
        }

        //3.)Java program to find the sum of natural numbers
        // System.out.println("Enter the number: ");
        // int n=myscanner.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++)
        // {
        //  sum+=i;
        // }
        // System.out.println("Sum of N natural numbers: "+sum);

        myscanner.close();
    }
}
