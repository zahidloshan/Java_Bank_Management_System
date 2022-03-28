
package BankManagement;

import java.util.Scanner;


public abstract class Account implements ITransactions {
    
   private  int accountNumber;
   private double balance;
   public void setAccountNumber(int accountNumber)
   {
       this.accountNumber=accountNumber;
   }
   public void setBalance(double balance)
   {
       this.balance=balance;
   }
   public int getAccountNumber( )
   {
       return accountNumber;
   }
   public double getBalance( )
   {
       return balance;
   }
   abstract void showInfo();
   
   @Override
   public void deposit(double amount)
   {
       double  balance;
        Scanner free=new Scanner(System.in);
        System.out.println("Enter Current Balance : ");
         balance=free.nextDouble();
       
         double newBalance;
         
         newBalance=balance+amount;
         System.out.println("New Balance : "+newBalance);
   }
   
   @Override
   public void withdraw(double amount)
   {
       double  balance;
        Scanner free=new Scanner(System.in);
        System.out.println("Enter Current Balance : ");
         balance=free.nextDouble();
       
         double newBalance;
         
         newBalance=balance-amount;
         System.out.println("New Balance : "+newBalance);
   }
   
   @Override
   public void transfer(Account a, double amount)
   {
       double  balance;
       String id;
        Scanner free=new Scanner(System.in);
        System.out.println("Enter Current Balance : ");
         balance=free.nextDouble();
         Scanner free1=new Scanner(System.in);
        System.out.println("Enter Recever  Id  : ");
         id=free1.next();
       
         double newBalance;
         
         newBalance=balance-amount;
         System.out.println("New Balance : "+newBalance);
       
   }
   
   
    
}
