public class SelectionStatements {
    public static void main(String[] args) {
        //1.if Statement:
        int age=19;
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }

        //2.)Nested if-else Statement
        int a=10,b=11,c=13;
        if(a>b && a>c)
        {
            System.out.println("a is the largest number: "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the largest number: "+b);
        }
        else
        {
            System.out.println("c is the largest number: "+c);
        }

        //3.)Switch statement:
        int day=5;
        String dayString;
        switch(day)
        {
            case 1:
            dayString="Sunday";
            break;

            case 2:
            dayString="Monday";
            break;

            case 3:
            dayString="Tuesday";
            break;

            case 4:
            dayString="Wednesday";
            break;

            case 5:
            dayString="Thusday";
            break;

            case 6:
            dayString="Friday";
            break;

            case 7:
            dayString="Satarday";
            break;

            default:
            dayString="Invalid day";
        }
        System.out.println(dayString);
    }
}
