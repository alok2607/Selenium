

public class BankAccount {
	String name;
	int accountID;
	double balance;
		 
		    public void setAccount( String username, int ID, Boolean isJoint)
		    {
		        name = username;
		        accountID = ID;
		         
		    }
		 
		    public void setAccount( String username, int ID, double B)
		    {
		        name = username;
		        accountID = ID;
		        balance = B;
		    }
		 
		 
		    public void deposit(double amount)
		    {
		    balance += amount;
		    }
		 
		    public void withdraw(double amount)
		    {
		    balance -= amount;
		    }
		 
		    public void setBalance(double amount)
		    {
		    balance = amount;
		    }
		 
		    public void printTransaction()
		    {
		    System.out.println("Name: " + name + "\n" + "Account ID: " + accountID + "\n" + "Balance Rs" + balance + "\n");
		    }
		 
		    public static void main (String args [])
		    {
		    	BankAccount obj1 = new BankAccount();
		    	obj1.setAccount("Abhijit", 5321, 0);
		    	obj1.printTransaction();
		    	obj1.setBalance(1000);
		    	obj1.printTransaction();
		    	obj1.withdraw(100);
		    	obj1.printTransaction();
		    	obj1.deposit(200);
		    	obj1.printTransaction();
		 
		    	BankAccount obj2 = new BankAccount();
		    	obj2.setAccount("Vaishali", 1388, 0);
		    	obj2.printTransaction();
		    	obj2.setBalance(1000);
		    	obj2.printTransaction();
		    	obj2.withdraw(300);
		    	obj2.printTransaction();
		    	obj2.deposit(100);
		    	obj2.printTransaction();
		    	
		      //creating object of SavingAccount
		    	SavingAccount sa = new SavingAccount();
		    	System.out.println("Saving Account <IS A> Account"); 
		    	sa.setBalance(1300);
		    	sa.printInterestRate(0);
		    	
		    	CheckingAccount chkacc = new CheckingAccount();
		    	System.out.println("Checking Account <IS A> Account");
		    	chkacc.setBalance(-500);
		    	chkacc.printoverdraft(0);
		}
		    
}


