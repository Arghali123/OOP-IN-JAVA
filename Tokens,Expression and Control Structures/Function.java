import java.util.Scanner;

public class Function {

    static int addition(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        // int firstResult=addition(10, 20);
        // int secondResult=addition(2,2);
        // System.out.println(firstResult);
        // System.out.println(secondResult);

        //Multiplication
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=obj.nextInt();
        System.out.print("Enter second number: ");
        int b=obj.nextInt();
        System.out.print("Enter third number: ");
        int c=obj.nextInt();
        int mulresult=multiplication(a, b,c);
        System.out.println("The result is: "+mulresult);
        obj.close();
    }

    static int multiplication(int a,int b,int c)
    {
        return a*b*c;
    }

}
