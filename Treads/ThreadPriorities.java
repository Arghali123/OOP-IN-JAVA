//Program to demonstrate thread Priorities
class ThreadA extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Running thread "+i+" from class A");
        }
        System.out.println("Exit from the class A");
    }
}

class ThreadB extends Thread
{
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
            System.out.println("Running thread "+j+" from class B");
        }
        System.out.println("Exit from the class B");
    }
}

class ThreadC extends Thread
{
    public void run()
    {
        for(int k=0;k<=5;k++)
        {
            System.out.println("Running thread "+k+" from class C");
        }
        System.out.println("Exit from the class C");
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        ThreadC t3=new ThreadC();

        //Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(t1.getPriority()+1);//or t2.setPriority(2)
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
