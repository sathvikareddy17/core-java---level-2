class Bank
{
	public void openAccount()
	{
		System.out.println("open acc");
		Account.displayAccountDetails();
		
	}
	public void closeAccount()
	{
		System.out.println("close acct..");
	}
	public static void checkBalance()
	{
		System.out.println("check balance");
		Account.trasferFunds();
	}
}
class Account
{
	public static void displayAccountDetails()
	{
		System.out.println("displayAccountDetails..");
		Bank.checkBalance();
	}
	public static void trasferFunds()
	{
		System.out.println("transfer fund..");
	}
}
class Transaction
{
	public static void logTransaction()
	{
		System.out.println("log transaction...");
		Bank b1 = new Bank();
		b1.openAccount();
	}
	public void processTransaction()
	{
		System.out.println("process transaction");
		Bank b1 = new Bank();
		b1.closeAccount();

	}
}

class MainClassA8 
{
	public static void main(String[] args) 
	{
		Transaction.logTransaction();
		Transaction t1 = new Transaction();
		t1.processTransaction();
	
	}
}
