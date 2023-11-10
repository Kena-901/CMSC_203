
public class SavingsAccount extends BankAccount{
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double balance)
	{
		super(name,balance);
		accountNumber ="-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double monthlyInterest;
		
		monthlyInterest = ((getBalance() * rate)/100) / 12;
		
		deposit(monthlyInterest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount,amount);
		rate = oldAccount.rate;
		savingsNumber = oldAccount.savingsNumber + 1;
		
		accountNumber ="-" + savingsNumber;
		
	}
}
