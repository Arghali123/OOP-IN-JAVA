class Athread
{
    int amount=10000;
    synchronized void withdraw(int amt)
    {
        System.out.println("Going to withdraw....");
        if(amount<amt)
        {
            System.out.println("Less balance;waiting for deposit...");
            try
            {
             wait();
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        amount-=amt;
        System.out.println("Withdraw completed with Rs: "+amt);
        System.out.println("Balance is :Rs "+amount);
    }

    synchronized void deposit(int amt)
    {
        System.out.println("Going to deposit...");
        amount+=amt;
        System.out.println("Deposit completed with Rs. "+amt);
        System.out.println("Balance is Rs. "+amount);
        notify();
    }
}
public class InterThreadCommunication {

    public static void main(String[] args) {
        Athread obj=new Athread();

        new Thread()
        {
            public void run()
            {
                obj.withdraw(15000);
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                obj.deposit(10000);
            }
        }.start();
    }
}