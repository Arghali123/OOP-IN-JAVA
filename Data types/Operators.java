public class Operators {
    public static void main(String[] args) {
        //Operators:Operators are symbol used to perform oprations(+,-,*,/)etc.
        //Operands:Operands are the variables.
        //(a+b):a and b are operands + is operator.

        //1.) Arthematic Operator: Performs mathematic Calculations(+,-,*,/).
        int a=20;
        int b=60;
        int addresult=a+b;
        int subresult=a-b;
        double divresult=(a/b);
        System.out.println("Addition: "+addresult);
        System.out.println("Subtraction: "+subresult);
        System.out.println("Division: "+divresult);

        //2.) Relational Operator(<,>,==,<=,>=,!=)
        int c=30;
        int d=40;
        System.out.println("c>d: "+(c>d));    
        System.out.println("c<d: "+(c<d));    
        System.out.println("c==d: "+(c==d)); 
        System.out.println("c>=d: "+(c>=d)); 
        System.out.println("c<=d: "+(c<=d)); 
        System.out.println("c!=d: "+(c!=d));
        
        //3.)Logical operator: (&&,||,!),boolean ma kam garxa.
        boolean x=true;
        boolean y=false;
        System.out.println("x && y: "+(x&&y));
        System.out.println("x || y: "+(x||y));
        System.out.println("!x: "+(!x));
        
        //4.) Assignment operator:(=,+=,-=,*=,/=,%=,<<=,>>=,&=,^=,!=)
        int e=2;
        int f=3;
        //System.out.println("=");
        System.out.println("e+=f: "+(e+=f));
        System.out.println("e-=f: "+(e-=f));
        System.out.println("e%=f: "+(e*=f));
        System.out.println("e/=f: "+(e/=f));
        System.out.println("e%=f: "+(e%=f));

        //5.)Ternary oparator
        //syntax:(condition)? "true":"false"
        int k=10;
        int l=20;
        String result=(k>l) ? "K is greater then l" : "K is less then l";
        System.out.println(result);
        System.out.println("-------------------");

        //6.) Bitwise operators: Bitwise operator works on bits and perform bit-by-bit operation(&,|,^,~,<<,>>,>>>)
        int m=9;
        int n=10;
        System.out.println("The Bitwise AND: "+(m&n)); 
        System.out.println("The Bitwise OR:"+(m|n));
        System.out.println("The Bitwise XOR:"+(m^n));//If both are different then 1 else 0;
        System.out.println("The Complement: "+(~m));
        System.out.println("---------------------------");

        //Post and pre-increment 
        int v=5;
        System.out.println("Post increment: "+ v++);
        System.out.println("Value of v: "+ v);
        System.out.println("pre increment: "+ ++v);
        System.out.println("---------------------------");
        

        //Pre and post decrement
        int s=10;
        System.out.println("Post decrement: "+ s--);
        System.out.println("Value of s: "+ s);
        System.out.println("Pre decrement: "+ --s);
        System.out.println("---------------------------");

        //Shift oprator:Used to manupulate the bits.
        //1.)Left shift(<<):shifts the bits to the left and fills 0 to the right
        int t=6;
        int leftShift=t<<2;
        System.out.println("Left shift: "+leftShift);
    }
}
