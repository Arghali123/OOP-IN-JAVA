class FirstThread extends Thread
{
    public void run()
    {
        System.out.println(
            getName()+"(Priority: "+getPriority()+" ) is running"
        );
    }
}
class SecondThread extends Thread
{
    public void run()
    {
        System.out.println(
            getName()+"(Priority: "+getPriority()+" ) is running"
        );
    }
}

public class ThreadPrioritiesExample {
    public static void main(String[] args) {
        //create instance of threads
        FirstThread firstThread=new FirstThread();
        SecondThread secondThread=new SecondThread();

        //setting priority
        firstThread.setPriority(Thread.MIN_PRIORITY);//Minimum priority =1
        secondThread.setPriority(Thread.MAX_PRIORITY);//Maximum priority =10

        //Setting name for thread
        firstThread.setName("First Thread");
        secondThread.setName("Second Thread");

        //start threads
        firstThread.start();
        secondThread.start();

        try
        {
            //wait for thread to finish
            firstThread.join();;
            secondThread.join();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("All threads execution is completed.");
    }
}
