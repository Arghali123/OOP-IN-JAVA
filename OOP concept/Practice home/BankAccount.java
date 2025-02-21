public class BankAccount {
    int acc_no;
    String acc_holder_name;
    double balance;

    BankAccount(int _acc_no,String _acc_holder_name,double _balance)
    {
        this.acc_no=_acc_no;
        this.acc_holder_name=_acc_holder_name;
        this.balance=_balance;
    }

    void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Deposited Amount: NRS"+amount);
        }
        else
        {System.out.println("Invalid amount");}
    }

    void withdraw(double amount) 
    {
      if(amount>0 && amount<balance)
      {
        balance=balance-amount;
        System.out.println("Withdrawn amount: "+amount);
      }
      else if(amount>0)
      {
        System.out.println("Insufficient amount");
      }
      else
      {
        System.out.println("Invalid");
      }
    }

    void displayBalance()
    {
        System.out.println(acc_holder_name+" Your current balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount obj=new BankAccount(1, "Daenish", 5000);
        BankAccount obj=new BankAccount(1, "Daenish", 5000);
        // obj.deposit(1000);
        // obj.displayBalance();
        obj.withdraw(2000);
        obj.displayBalance();
    }
}
