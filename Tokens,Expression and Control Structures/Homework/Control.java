package Homework;

public class Control {
    public static void main(String[] args) {
        //1.)To check whether the person is elligible to vote or not.
        int age=19;
        String decision=(age>=18)? "You are elligible to vote":"You are not elligible to vote";
        System.out.println(decision);

        //2.)Make a simple calculator with operations(+,-,/,*)using switch.
        int a=15;
        int b=5;
        int result;
        char option='*';
        switch(option)
        {
            case '+':
            result=a+b;
            System.out.println("a+b: "+result);
            break;

            case '-':
            result=a-b;
            System.out.println("a-b: "+result);
            break;

            case '/':
            result=a/b;
            System.out.println("a/b: "+result);
            break;

            case '*':
            result=a*b;
            System.out.println("a*b: "+result);
            break;

            default:
            System.out.println("Invalid option!!");
        }

        //3.)Print the gretest among three numbers.
        int x=12;
        int y=13;
        int z=122;
        if(x>y && x>z)
        {
            System.out.println("The greatest is: "+x);
        }
        else if(y>x && y>z)
        {
            System.out.println("The greatest is: "+y);
        }
        else
        {
            System.out.println("The greatest is: "+z);
        }
        
    }
}
