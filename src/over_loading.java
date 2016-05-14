
public class over_loading
	{
	    String name;
	    String date;
	 
	    over_loading(String n, String d)
	    {
	    name = n;
	    date = d;
	    System.out.println("I'm:" + name + "Your Money will be available:" + date);
	    }
	 
	    public void createAccounts()
	    {
	       BankAccount b1 = new BankAccount();
	       b1.setAccount("Vaishali", 500);
	       b1.setBanlance(10,3);
	       b1.printTransaction();
	 
	       CheckingAccount c1 = new CheckingAccount();
	       c1.setAccount("Shashi" , 300);
	       c1.printoverdraft(15);
	       c1.setBalance(100, 5);
	       c1.printTransaction();
	    	     
	       SavingAccount s1 = new SavingAccount();
	       s1.setAccount("Suraj" , 300);
	       s1.printInterestRate(0.5);
	       s1.setBalance(100, 5);
           s1.printTransaction();
	     
	     
	       //SetAccount SA = new SetAccount();
	       //SA.name("Vaishali");
	       //SA.accountID(21);
	         
           CheckingAccount obj1 = new CheckingAccount();
           obj1.setAccount("Abhijit","", 15);
	    }                 
	 
	         
	    public static void main(String args[])
	    {
	    	over_loading t1 = new over_loading ("Pinky", "Tommorrow");
	        t1.createAccounts();
	    }
}