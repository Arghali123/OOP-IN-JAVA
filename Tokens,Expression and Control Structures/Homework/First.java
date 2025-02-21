//package Homework;

import java.util.Scanner;

public class First {
    public static void main(String[] args)
     {
        // 1.) Write a for loop to calculate the sum of N natural numbers.
        Scanner num = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int enteredNum = num.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= enteredNum; i++) {
        //     sum = sum + i;
        // }
        // System.out.println("The sum of " + enteredNum + " is: " + sum);

        //2.)Print all the even numbers between 1 and 50 using while loop.
        // for(int i=2;i<50;i++)
        // {
        //     if(i%2!=0)
        //     {
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }

        //3.) Print numbers from 100 to 1 in reverse order using while loop.
        // int number=100;
        // while(number>=1)
        // {
        //   System.out.print(number+" ");
        //   number--;
        // }

        //4.) Write a for loop to find the factorial of number N;
        // System.out.print("Enter a number: ");
        // long N=num.nextLong();
        // long fact=1;
        // for(int i=1;i<=N;i++)
        // {
        //     fact*=i;
        // }
        // System.out.println("The factorial of "+N+" is: "+fact);

        //5.)Print the first N fibonacci series upto numbers using for loop;
        // System.out.print("Enter a number: ");
        // int size=num.nextInt();
        // int a=0;
        // int b=1;
        // int c;
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(a+" ");
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }

        //5.)Reverse a digit using while loop.
        // System.out.println("Enter a number: ");
        // int number=num.nextInt();
        // int rem,reverse=0;
        //  while(number!=0)
        //  {
        //     rem=number%10;
        //     reverse=reverse*10+rem;
        //     number=number/10;
        //  }
        //  System.out.println("Reverse order: "+reverse);

        //6.)Find the largest digit in the given number(e.g 987->9) using while loop
        System.out.print("Enter a number: ");
        int number=num.nextInt();
        int rem=number%10;
        number=number/10;
        int largest=rem;
        while(number!=0)
        {
            rem=number%10;
            if(largest<rem)
            {
                largest=rem;
            }
            number=number/10;
        }

        System.out.println("The largest digit in the given number is: "+largest);
        num.close();
    }
}
