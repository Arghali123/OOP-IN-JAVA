package Interface;
interface interface1
{
    int a=20;
    int b=10;
    void add();
}

class Ax
{
    int diff;
    void subtract(int x,int y)
    {
        diff=x-y;
        System.out.println("Subraction: "+diff);
    }
}

class Bx extends Ax implements interface1
{
    int sum;
    public void add()
    {
        sum=a+b;
        System.out.println("Addition: "+sum);
    }
}

public class AnotherEg {
    public static void main(String[] args) {
        Bx obj=new Bx();
        obj.add();
        obj.subtract(9, 7);
    }
}
