class ThreadA implements Runnable
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Running Thread "+i+" From Class A");
        }
        System.out.println("Exit from class A");
    }
}

class ThreadB implements Runnable
{
    public void run()
    {
        for(int j=1;j<=3;j++)
        {
            System.out.println("Running Thread "+j+" From Class B");
        }
        System.out.println("Exit from the class B");
    }
}

public class ThreadExample1 {

    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadA());
        Thread t2=new Thread(new ThreadB());

        t1.start();
        t2.start();
    }
}