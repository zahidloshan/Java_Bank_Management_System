
package BankManagement;


public class SavingsAccount extends Account{
    
    private double interestRate;
    public void setInterestRate(double interestRate)
    {
        this.interestRate=interestRate;
    }
    public double getInterestRate( )
    {
        return interestRate;
    }
    
    @Override
    void showInfo()
    {
        System.out.println("Account No : "+getAccountNumber());
        System.out.println("Banlance : "+getBalance());
        System.out.println("InterestRate : "+getInterestRate( ));
        
    }
    
    
}
