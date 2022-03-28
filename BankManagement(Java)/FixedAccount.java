
package BankManagement;

public class FixedAccount extends Account{
    
    private int tenureYear;
    public void setTenureYear(int tenureYear)
    {
        this.tenureYear=tenureYear;
    }
    public int getTenureYear( )
    {
        return tenureYear;
    }
    @Override
     void showInfo()
    {
        System.out.println("Account No : "+getAccountNumber());
        System.out.println("Banlance : "+getBalance());
        System.out.println("Year : "+getTenureYear());
        
    }
    
}
