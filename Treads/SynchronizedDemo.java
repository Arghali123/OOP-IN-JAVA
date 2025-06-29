class Display
{
    public synchronized void displayn()
    {
      for(int i=1;i<=3;i++)
      {
        System.out.print(i+" ");
        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e){}
      }
    }

    public synchronized void displayc()
    {
        for(int j=65;j<=67;j++)
        {
            System.out.print((char)j+" ");
        }
        try
        {
            Thread.sleep(2000);
        }catch(InterruptedException e){}
    }
}

class Thread1 extends Thread
{
    Display d;
    Thread1(Display  d)
    {
        this.d=d;
    }
    public void run()
    {
        d.displayn();
    }
}

class Thread2 extends Thread
{
    Display d;
    Thread2(Display  d)
    {
        this.d=d;
    }
    public void run()
    {
        d.displayc();
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d=new Display();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t1.start();
        t2.start();
    }
}
