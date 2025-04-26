//Program to demonstrate stop() and sleep()
class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Running thread "+i+" from class A");
            if(i==2)
            {
                try
                {
                  sleep(2000);//in milliseconds;
                  
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Exit from the class A");
    }
}


class ThreadB extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("Running thread "+j+" from class B");
        }
        System.out.println("Exit from the class B");
    }
}
public class StoppingAndBlockingThread {
public static void main(String[] args) {
    new ThreadA().start();
    new ThreadB().start();
}
}