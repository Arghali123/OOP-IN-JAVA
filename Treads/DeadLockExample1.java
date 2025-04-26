public class DeadLockExample1 {
    //create two resources
    private static final Object resource1=new Object();
    private static final Object resource2=new Object();
    public static void main(String[] args) {
        //create first thread/task/process
        Thread t1=new Thread(()->
        {
          synchronized(resource1)
          {
            System.out.println("Thread1 is using the resourse 1");
            try
            {
                Thread.sleep(100);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
            synchronized(resource2)
            {
                System.out.println("Thread1 is using resource 2");
            }
         }
        });

        //create seconnd thread/task/process
        Thread t2=new Thread(()->
        {
          synchronized(resource2)
          {
            System.out.println("Thread2 is using the resourse 2");
            try
            {
                Thread.sleep(100);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
            synchronized(resource1)
            {
                System.out.println("Thread2 is using resource 1");
            }
         }
        });

        t1.start();
        t2.start();
    }
}
