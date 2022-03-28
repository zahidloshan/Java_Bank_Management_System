
package BankManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Customer implements AccountOperations{
    
   private String name;
   private int nid;
   private Account accounts;
   public void setName(String name)
   {
       this.name=name;
   }
   public void setNid(int nid)
   {
       this.nid=nid;
   }
   public String getName( )
   {
       return name;
   }
   public int getNid( )
   {
       return nid;
   }
   
   @Override
   public void insertAccount(Account a)
   {
     Customer c=new Customer ();
     int cid;
     Scanner input1=new Scanner(System.in);
     System.out.println("Enter Customer Id : ");
     c.setNid(cid=input1.nextInt());
     
      System.out.println("Choice your option");
             System.out.print("1. SavingsAccount ");
             System.out.print("      2. FixedAccount");
             System.out.println("");
             Scanner usert=new Scanner(System.in);
             int accountType;
             accountType=usert.nextInt();
            
            if(accountType==1)
            {
               double interestRate;
               int accountNumber;
               double balance;
                SavingsAccount sava = new SavingsAccount();
                Scanner input4=new Scanner(System.in);
                System.out.println("Enter Account Number : ");
                sava.setAccountNumber(accountNumber=input4.nextInt());
                System.out.print("Enter InterestRate : ");
                Scanner input=new Scanner(System.in);
                sava.setInterestRate(interestRate=input.nextDouble());
                System.out.print("Enter Balance : ");
                sava.setBalance(balance=input.nextDouble());
                
               File file = new File("C:\\Users\\Asus\\Desktop\\account.txt");
         
         FileWriter fileWriter = null;


        try{
            file.createNewFile();
            fileWriter=new FileWriter("C:\\Users\\Asus\\Desktop\\account.txt",true);
            
            fileWriter.write(Integer.toString(sava.getAccountNumber()));
            fileWriter.write("     ");
            fileWriter.write(String.valueOf(sava.getInterestRate()));
            fileWriter.write("     ");
            fileWriter.write(String.valueOf(sava.getBalance()));
            fileWriter.write("     ");
            fileWriter.write(Integer.toString(c.getNid()));
            fileWriter.write("     ");
            fileWriter.write("SavingsAccount");
            
            fileWriter.write("\n");
           
            

        }catch(IOException e)
        {
            System.out.println("IO Exception");

        }
        finally{
            
                try{
                fileWriter.close();
            }catch(IOException e1){
               
                System.out.println("IOException occurred!! Couldn't close the resource");

            }
        }
                
               
            }
           
              
            
            
            else if(accountType==2)
            {
                int tenureYear;
               int accountNumber;
               double balance;
                FixedAccount fxa = new FixedAccount();
                Scanner input4=new Scanner(System.in);
                System.out.println("Enter Account Number : ");
                fxa.setAccountNumber(accountNumber=input4.nextInt());
                System.out.print("Enter tenureYear : ");
                Scanner input=new Scanner(System.in);
                fxa.setTenureYear(tenureYear=input4.nextInt());
                System.out.print("Enter Balance : ");
                fxa.setBalance(balance=input.nextDouble());
                
               File file = new File("C:\\Users\\Asus\\Desktop\\account.txt");
         
         FileWriter fileWriter = null;


        try{
            file.createNewFile();
            fileWriter=new FileWriter("C:\\Users\\Asus\\Desktop\\account.txt",true);
            
            fileWriter.write(Integer.toString(fxa.getAccountNumber()));
            fileWriter.write("     ");
            fileWriter.write(String.valueOf(fxa.getTenureYear()));
            fileWriter.write("     ");
            fileWriter.write(String.valueOf(fxa.getBalance()));
            fileWriter.write("     ");
            fileWriter.write(Integer.toString(c.getNid()));
            fileWriter.write("     ");
            fileWriter.write("FixedAccount");
            
            fileWriter.write("\n");
           
            

        }catch(IOException e)
        {
            System.out.println("IO Exception");

        }
        finally{
            
                try{
                fileWriter.close();
            }catch(IOException e1){
               
                System.out.println("IOException occurred!! Couldn't close the resource");

            }
        }
                
              
                
                
            }
      
     
   }
   
   @Override
   public Account getAccount(int accountNumber)
   {
     Account a;
    FixedAccount fxa1 = new FixedAccount();
    a=fxa1;
    int countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\Asus\\Desktop\\account.txt";
    BufferedReader br;
    
    String inputSearch=Integer.toString(accountNumber);
    
    String line = "";
    try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
                countLine++;
                
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                    countBuffer++;
                  }
                  
                }

                if(countBuffer > 0)
                {
                    countBuffer = 0;
                    lineNumber += countLine ;
                }

            }
            br.close();
        } catch (IOException ex) {
            System.out.println("IOException occurred!!");  
        }
    } catch (FileNotFoundException ex) {
        System.out.println("FileNotFoundException occurred!!");
    }
    System.out.println("ID Found at Line : "+lineNumber);
    
    String text = "";
    int lineNumb;
    try {
      FileReader readfile = new FileReader("C:\\Users\\Asus\\Desktop\\account.txt");
      BufferedReader readbuffer = new BufferedReader(readfile);
      for (lineNumb = 1; lineNumb < 100; lineNumb++) {
        if (lineNumb == Integer.parseInt(lineNumber)) {
          text = readbuffer.readLine();
        } else
          readbuffer.readLine();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    System.out.println("The specific Line is: " + text);
  
    
    return a;   
       
   }
   
   @Override
   public void showAllAccounts( )
   {
       FileReader fileReader = null;
  
        try {
            fileReader = new FileReader("C:\\Users\\Asus\\Desktop\\account.txt");
  
            int i = 0;
            while((i = fileReader.read()) != -1) {
                System.out.print((char)i + " ");
            }
        }
        catch(IOException io) {
            System.out.println("IOException occurred!!");
        }
        finally {
            try {
                fileReader.close();
            }
            catch(IOException io) {
                System.out.println("IOException occurred!! Couldn't close the resource");
            }
        }
   }
}
