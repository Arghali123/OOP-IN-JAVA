import java.lang.Runnable;

class MyThreadRunnable implements Runnable
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
        System.out.println("Thread: "+i);
    }
  }
}
public class ThreadRunnableExample {
    public static void main(String[] args) {
       Runnable runnable=new MyThreadRunnable();
       Thread t1=new Thread(runnable);
       t1.start();

       //Sleep
       //thread priority padara auena 
    }
}
