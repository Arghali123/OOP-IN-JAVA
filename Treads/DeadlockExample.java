public class DeadlockExample 
{
    //create two resources 
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    public static void main(String[] args) 
    { 
        // thread 1
        Thread t1= new Thread(() -> 
        {
            synchronized (resource1) 
            {
                System.out.println("Thread 1 is using resource 1");
                try {
                    Thread.sleep(100); // Simulate some work with resource 1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1 is using resource 2");
                }
            }
        });

        //thread 2
        Thread t2= new Thread(() -> 
        {
            synchronized (resource2) {
                System.out.println("Thread 2 is using resource 2");
                try {
                    Thread.sleep(100); // Simulate some work with resource 1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 1 is using resource 2");
                }
            }
        });
        
        t1.start();
        t2.start();
    }

}