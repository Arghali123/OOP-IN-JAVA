public class RecursionExample {

    //Recursive method to calculate factorial
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;//Base case
        }
        return n*factorial(n-1);//Recursive case
    }

    //Recurcive method to calculate fibonacci series
    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
       System.out.println("The factorial is: "+factorial(5));
       for(int i=0;i<=5;i++)
       {
        System.out.print(fibonacci(i)+" ");
       }
    }
}