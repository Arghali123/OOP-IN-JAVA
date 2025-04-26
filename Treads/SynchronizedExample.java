class Counter
{
    private int c=0;//Shared variable

    //Synchronized method to increment counter
    public synchronized void inc()
    {
        c++;
    }

    //Synchronized method to get the counter value
    public synchronized int get()
    {
        return c;
    }
}

public class SynchronizedExample {
    public static void main(String[] args)
    {
      Counter cnt=new Counter();//Shared resouce

      //Thread1 to increment counter
      Thread t1=new Thread(()->
      {
        for(int i=0;i<100;i++)
        {
            cnt.inc();
        }
      });

      //Thread2 to increment counter
      Thread t2=new Thread(()->
      {
        for(int i=0;i<100;i++)
        {
            cnt.inc();
        }
      });

      //Start both threads
      t1.start();
      t2.start();

      //wait for thread to finish
      try
      {
        t1.join();
        t2.join();
      }catch(InterruptedException e)
      {
        e.printStackTrace();
      }

      //Print the final counter value
      System.out.println("Counter: "+cnt.get());
    }
}