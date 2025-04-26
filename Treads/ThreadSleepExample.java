public class ThreadSleepExample {
    public static void main(String[] args) {
        //first thread
        Thread firstThread=new Thread(()->
        {
          try
          {
            for(int i=1;i<=3;i++)
            {
                System.out.println("First thread -count: "+i);
                Thread.sleep(500);//sleeps for 500 sec
            }
          }catch(Exception e)
          {
            e.printStackTrace();
          }
        });

        //Second thread
        Thread secondThread=new Thread(()->
        {
          try
          {
            for(int i=1;i<=3;i++)
            {
                System.out.println("Second thread -count: "+i);
                Thread.sleep(1000);//sleeps for 1000 sec
            }
          }catch(Exception e)
          {
            e.printStackTrace();
          }
        });

        //start all thread
        firstThread.start();
        secondThread.start();

        //4-core CPU (cuncurrently runs 8 threads)
        //8-core CPU (cuncurrently runs 16 threads)
    }
}
