class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Running Thread "+i+" from Class A");
        }
        System.out.println("Exit from the class A");
    }
}

class ThreadB extends Thread
{
    public void run()
    {
        for(int j=1;j<=3;j++)
        {
          System.out.println("Running Thread "+j+" from Class B");
        }
        System.out.println("Exit from the class B");
    }
}


public class ThreadExample {

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
