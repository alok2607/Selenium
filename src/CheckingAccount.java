

public class CheckingAccount extends BankAccount
{
   double overdraftAmount;
 
    public void setBalance(double amount)
    {
    	if(balance <= 0)
         {
            balance = amount + printoverdraft(overdraftAmount);
         }
        else
         {
             System.out.println("Error");
         }
    	System.out.println("Checking Balance After Overdraft:" + balance);
    }
 
    public double printoverdraft(double amount)
    {
 
          overdraftAmount = amount;
          System.out.println("Your over draft ammount is:" + overdraftAmount);
          return amount;
    }
}