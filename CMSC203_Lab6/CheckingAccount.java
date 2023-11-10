
public class CheckingAccount extends BankAccount {
	
	static final double FEE = 0.15;
	
	public CheckingAccount(String name,double amount)
	{
		super(name,amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		boolean completed = true;

		if (amount <= getBalance())
		{
			setBalance(((getBalance() - amount)+ FEE));
		}
		else
		{
			completed = false;
		}
		return completed;
	}

}
