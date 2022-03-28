
package BankManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Bank implements EmployeeOperations ,CustomerOperations{
    
    public Customer customers[];
    public Employee employees[];
    
    
    @Override
    public void insertEmployee(Employee e)
    {
        File file = new File("C:\\Users\\Asus\\Desktop\\emp.txt");
         
         FileWriter fileWriter = null;
        
           employees=new Employee[20];
           
        try{
            file.createNewFile();
            fileWriter=new FileWriter("C:\\Users\\Asus\\Desktop\\emp.txt",true);
            
            System.out.println("How many EMP You Want to Insert : ");
            Scanner input = new Scanner(System.in);
            int snumber=input.nextInt();
            
            for(int i=0;i<snumber;i++)
	    {
           employees[i]=new Employee();
          
           String ename,empid;
             double esalary;
            
            Scanner scb=new Scanner(System.in);
            Scanner scb1=new Scanner(System.in);
             Scanner scb2=new Scanner(System.in);
            
            System.out.println("Emp Name  : ");
            employees[i].setName(ename=scb1.nextLine());
            System.out.println("Emp Id  : ");
            employees[i].setEmpId(empid=scb2.nextLine());
            System.out.println("Salary : ");
            employees[i].setSalary(esalary=scb.nextDouble());
            
            fileWriter.write(employees[i].getName());
            fileWriter.write("     ");
            fileWriter.write(employees[i].getEmpId());
            fileWriter.write("     ");
            fileWriter.write(String.valueOf(employees[i].getSalary()));
            
            fileWriter.write("\n");
            }
   
            
            
            

        }catch(IOException exp)
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
    
    @Override
    public  Employee getEmployee(int empId)
    {
    Employee e=new Employee();
    FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        
        try{
        fileReader = new FileReader("C:\\Users\\Asus\\Desktop\\emp.txt");
        bufferedReader=new BufferedReader(fileReader);
        
            
        String line = "";
            String searchKey =Integer.toString(empId);
            String words[] = null;
           
            while((line = bufferedReader.readLine()) != null) {
                
                words = line.split(" ");
                for(String word: words) {
                    if(word.equals(searchKey))
                    {
                        System.out.println(line);
                        
                    }
                }
                
            }
            
        }catch(IOException o)
        {
            System.out.println("io Exception");
        }
       
        finally {

            try {
                fileReader.close();
            } catch (IOException ex) {

                System.out.println("IOException occurred");

            }
        }
    
    return e;
    }
    
    @Override
    public void showAllEmployees( )
    {
        FileReader fileReader = null;
  
        try {
            fileReader = new FileReader("C:\\Users\\Asus\\Desktop\\emp.txt");
  
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
    
    @Override
    public void insertCustomer(Customer c)
    {
        
        File file = new File("C:\\Users\\Asus\\Desktop\\customer.txt");
         
         FileWriter fileWriter = null;
        
           customers=new Customer[20];
           
        try{
            file.createNewFile();
            fileWriter=new FileWriter("C:\\Users\\Asus\\Desktop\\customer.txt",true);
            
            System.out.println("How many Customer You Want to Insert : ");
            Scanner input = new Scanner(System.in);
            int snumber=input.nextInt();
            
            for(int i=0;i<snumber;i++)
	    {
           customers[i]=new Customer();
          
           String cname;
           int cid;
             
            
            Scanner scb=new Scanner(System.in);
            Scanner scb1=new Scanner(System.in);
            
            
            System.out.println("Customer Name  : ");
            customers[i].setName(cname=scb1.nextLine());
            System.out.println("Customer Id  : ");
            customers[i].setNid(cid=scb1.nextInt());
            
            
            
            fileWriter.write(customers[i].getName());
            fileWriter.write("     ");
            fileWriter.write(Integer.toString(customers[i].getNid()));
            
            fileWriter.write("\n");
            }
   
            
            
            

        }catch(IOException exp)
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
    
    @Override
    public Customer getCustomer(int nid)
    {
     Customer c=new Customer();
    int countBuffer=0,countLine=0;
    String lineNumber = "";
    String filePath = "C:\\Users\\Asus\\Desktop\\customer.txt";
    BufferedReader br;
    
    String inputSearch=Integer.toString(nid);
    
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
      FileReader readfile = new FileReader("C:\\Users\\Asus\\Desktop\\customer.txt");
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
  
    
    return c;   
        
        
    }
    
    @Override
    public void showAllCustomers()
    {
        
        FileReader fileReader = null;
  
        try {
            fileReader = new FileReader("C:\\Users\\Asus\\Desktop\\customer.txt");
  
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
