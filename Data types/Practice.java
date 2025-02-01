public class Practice {
    public static void main(String[] args) {
        //1.)Give an example of logical operator(||,&)
        boolean a=true;
        boolean b=false;
        System.out.println("Logical AND: "+(a&&b));
        System.out.println("Logical OR: "+(a||b));

        //2.)Give an example of Bitwise operator(~)
        int c=3;
        System.out.println("The complement: "+(~c));

        //3.)Give an example of arthematic operator(+,%)
        int d=10;
        int e=12;
        int sumResult=d+e;
        System.out.println("Addition: "+sumResult);
        System.out.println("Modulus result: "+(d%3));

        //4.)Give an example of ternary operator(check for eligible to vote or note)
        int age=19;
        String decision=(age>=18)? "You can vote":"You cannot vote";
        System.out.println(decision);

        //5.)Give an example of pre-inc and post decrement(number=8)
        int number=8;
        System.out.println("Pre-increment: "+ (++number));
        System.out.println("post-decrement: "+ (number--));
        System.out.println("Value of number: "+(number));

        //6.)Give an example of Right shift by 3 (number=7)
        int num=7;
        int rightShift=num>>3;
        System.out.println("Right shift by 3: "+(rightShift));
    }
}
