class MyThread extends Thread
{
    int total=0;

    public void run()
    {
        synchronized(this)
        {
            System.out.println("Child Thread Starts Calculation");
            for(int i=1;i<=100;i++)
            {
              total=total+i;
            }

            System.out.println("Child Thread try to give notification.");
            this.notify();
        }
    }
}

public class IntraThreadCommunication {
    public static void main(String[] args) {
        MyThread b=new MyThread();
        b.start();
       
        synchronized(b)
        {
            try
            {
            System.out.println("Main Thread trying to call wait() method");
            b.wait();
            System.out.println("Main Thread gets Notification");
            System.out.println(b.total);
            }catch(InterruptedException e){}
           
        }
    }
}
