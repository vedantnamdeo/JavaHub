package BankManagementSystem.core;

public enum AccountType 
{
	SAVINGS(5000),CURRENT(10000),FD(6000);
	private double minBalance;
	private AccountType(double minBalance)
	{
		this.minBalance=minBalance;
	}
	public String toString()
	{
		return "Type:"+name()+" MinBalance:$"+minBalance;
	}
	public double getMinBalance() 
	{
		return minBalance;
	}
	public void setMinBalance(double minBalance) 
	{
		this.minBalance = minBalance;
	}
	
}
