import java.util.ArrayList;
import java.util.Scanner;
//Implement a BankAccount class with attributes accountNumber,
//holderName, and balance. Provide methods to deposit(), withdraw(),
//and displayBalance().
class BankAccount
{
    private String accountNumber;
    private String holderName;
    private double balance;
    protected static ArrayList<BankAccount> accounts=new ArrayList<>();
    
    public BankAccount(String accountNumber,String holderName,double balance)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
        accounts.add(this);
    }

    public void deposit(int amount)
    {
       if(amount>0)
       {
        balance+=amount;
        System.out.println("Desposited Rs "+amount+" ,New balance Rs "+balance);
       }
       else
       {
        System.err.println("Desposited amount must be positive interger.");
       }
    }

    public void withdraw(int amount)
    {
      if(amount>0 && amount<=balance)
      {
        balance-=amount;
        System.out.println("Withdrew Rs "+amount+" ,New balance Rs "+balance);
      }
      else
      {
        System.out.println("Invalid withdrawal amount or insufficent balance.");
      }
    }

    public void displayHoldersInfo()
    {
      System.out.println("Account Number: "+accountNumber+",Holder's Name: "+holderName+",Balance: Rs "+balance);
    }
}

public class Bank
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter details for 5 account holder:");
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter account number: ");
            String accountNumber=scanner.next();
            System.out.print("Enter holder name: ");
            String holderName=scanner.next();
            System.out.print("Enter balance: ");
            double balance=scanner.nextDouble();
            scanner.nextLine();
            new BankAccount(accountNumber, holderName, balance);
        }
        System.out.println("Holders information:");
        for(BankAccount account:BankAccount.accounts)
        {
            account.displayHoldersInfo();
        }

        scanner.close();
    }
}