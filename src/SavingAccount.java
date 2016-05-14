
// "super" keyword refer base class
// "this" keyword refer current class

public class SavingAccount extends BankAccount
{
   double InterestRate;
  
    public void setBalance(double amount)
    {
    	//if (balance > 0)
    	//{
          balance = amount + printInterestRate (InterestRate);
    	//} 
      //return amount;
    	System.out.println("Saving Balance:" + balance);
    }
 
    public double printInterestRate(double amount)
    {
          InterestRate = amount/100;
          System.out.println("your interest rate is:" + InterestRate);
          return amount;
    }
 
}