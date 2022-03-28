
package BankManagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class Start {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char ch;
        do{
       
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Customer Account Management");
        System.out.println("4. Account Transactions");
        System.out.println("5. Exit");
        
        System.out.println("Choice your option");
        ch=in.next().charAt(0);
     
      switch(ch) {
         case '1' ://EMp MANAGMENT
            employeeManagement();
            break;   
         case '2' ://CustomerManagement
            customerManagement();
            break;
         case '3' ://CustomerAccountManagement
            customerAccountManagement();
            break;
         case '4' ://ITransactions
            employeeBalancManagement();
            break;
        case '5' :
            System.out.println("Exit");
            break;    
      }
      
      }while(Character.getNumericValue(ch)!=5); 

   }
    
    static void employeeManagement()
    {
        System.out.println("Options for Employee Management:");
            System.out.print("1. Insert New Employee ");
            System.out.print("     2. Get Existing Employee by Id");
            System.out.print("     3. Show All Employees");
            System.out.println("");
        Scanner in2=new Scanner(System.in);
        char ch1;
        System.out.println("Choice your option");
        ch1=in2.next().charAt(0);

      switch(ch1) {
         case '1' :
            EmployeeOperations ob=new Bank();
            Employee e=new Employee();
        
            ob.insertEmployee(e);
            System.out.println("Emp Insert Complete");
            break;
         case '2' :
             int empId;
             Scanner input1=new Scanner(System.in);
             
             System.out.print("Enter Emp Id : ");
             empId=input1.nextInt();
             EmployeeOperations ob2=new Bank();
             ob2.getEmployee(empId);
          
            break;
         case '3' :
            EmployeeOperations ob3=new Bank();
            ob3.showAllEmployees( );
            break;
      }
    }
    
    static void customerManagement()
    {
         System.out.println("Options for Customer Management:");
            System.out.print("1. Insert New Customer ");
            System.out.print("     2. Get Existing Customer by Id");
            System.out.print("     3. Show All Customer");
            System.out.println("");
        Scanner in2=new Scanner(System.in);
        char ch1;
        System.out.println("Choice your option");
        ch1=in2.next().charAt(0);

      switch(ch1) {
         case '1' :
            CustomerOperations ob=new Bank();
            Customer c=new Customer();
        
            ob.insertCustomer(c);
            System.out.println("Customer Insert Complete");
            break;
         case '2' :
             int cId;
             Scanner input1=new Scanner(System.in);
             
             System.out.print("Enter Emp Id : ");
             cId=input1.nextInt();
             CustomerOperations ob2=new Bank();
             ob2.getCustomer(cId);
          
            break;
         case '3' :
            CustomerOperations ob3=new Bank();
             ob3.showAllCustomers( );
            break;
      }
    }
    
    static void customerAccountManagement()
    {
        
        System.out.println("Options for Customer Management:");
            System.out.print("1. Insert New Account ");
            System.out.print("     2. Get Existing Account by Id");
            System.out.print("     3. Show All Accounts");
            System.out.println("");
        Scanner in2=new Scanner(System.in);
        char ch1;
        System.out.println("Choice your option");
        ch1=in2.next().charAt(0);

      switch(ch1) {
         case '1' :
            AccountOperations ob=new Customer();
            Account a;
            SavingsAccount sava1 = new SavingsAccount();
            a=sava1;
            
            ob.insertAccount(a);

            System.out.println("Account Insert Complete");
            break;
         case '2' :
             int AccountId;
             Scanner input1=new Scanner(System.in);
             
             System.out.print("Enter Account Number : ");
             AccountId=input1.nextInt();
             AccountOperations ob2=new Customer();
             ob2.getAccount(AccountId);
          
            break;
         case '3' :
            AccountOperations ob3=new Customer();
             ob3.showAllAccounts( );
            break;
      }
        
    }
    
    static void employeeBalancManagement()
    {
        Account a;
        SavingsAccount sa=new SavingsAccount();
        a=sa;
        System.out.println("Options for  Employee Balance Management:");
            System.out.print("1. Deposit Money ");
            System.out.print("     2. Withdraw Money");
            System.out.print("     3. Transfer Money");
            System.out.println("");
        Scanner in2=new Scanner(System.in);
        char ch1;
        System.out.println("Choice your option");
        ch1=in2.next().charAt(0);

      switch(ch1) {
         case '1' :
           double  amount;
           Scanner free=new Scanner(System.in);
           System.out.println("Enter Your deposit amount : ");
           amount=free.nextDouble();
           a.deposit( amount);
            break;
         case '2' :
           double  amount1;
           Scanner free1=new Scanner(System.in);
           System.out.println("Enter Your Withdraw Money : ");
           amount1=free1.nextDouble();
           a.withdraw( amount1);
            break;
         case '3' :
            double  amount2;
           Scanner free2=new Scanner(System.in);
           System.out.println("Enter Your Transfer Money : ");
           amount1=free2.nextDouble();
           a.transfer(a, amount1);
            break;
      }
        
        
         
        
        
    }
            
    
}
