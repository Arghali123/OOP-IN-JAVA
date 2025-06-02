/*
Create a BankAccount class with a default constructor and a parameterized constructor. The default constructor should initialize
with a balance of 0, while the parameterized one should allow the user to specify the balance. 
 */

class BankAccount
{
    String customerName;
    int customer_id;
    float balance;

    public BankAccount()
    {
        this.balance=0;
    }
    public BankAccount(String name,int id,float balance)
    {
        this.customerName=name;
        this.customer_id=id;
        this.balance=balance;
    }


    public double getBalance()
    {
        return balance;
    }

    @Override
    public String toString()
    {
      return "Customer Name: "+customerName+" ,Customer ID: "+customer_id+" ,Bank Balance: "+balance;
    }

}
public class Question14 {
    public static void main(String[] args) {
      BankAccount customer1=new BankAccount();
      BankAccount customer2=new BankAccount("Daensish", 10, 100000);
      System.out.println("Customer1 Balance: $"+customer1.getBalance());
      System.out.println("Customer2 Balance: $"+customer2.getBalance());
    }
}
