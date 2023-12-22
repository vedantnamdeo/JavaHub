package BankManagementSystem.core;

import java.time.LocalDate;

import static BankManagementSystem.utils.ValidationRules.*;
import BankManagementSystem.custom_exceptions.InvalidInputException;

public class BankAccount 
{
	private int acctNo;
	private String Cust_Name;
	private AccountType type;
	
	private double balance;
	private LocalDate creationDate;
	private LocalDate lasttxDate;
	private boolean isActive;
	
	public BankAccount(int acctNo, String cust_Name, AccountType type, 
			double balance, LocalDate creationDate,
		 boolean isActive) 
	{
		super();
		this.acctNo = acctNo;
		Cust_Name = cust_Name;
		this.type = type;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lasttxDate =LocalDate.parse( this.creationDate.toString());
		this.isActive = isActive;
	}
	public void deposit(double amount) throws InvalidInputException
	{
		if(!this.isActive)
			throw new InvalidInputException("Deposit Tx denied,A/c Inactive!!!");
		this.lasttxDate=LocalDate.now();
		this.balance+=amount;
	}
	public void withdraw(double amount) throws InvalidInputException
	{
		if(!this.isActive)
			throw new InvalidInputException("Withdraw Tx denied,A/c Inactive!!!");
		ValidateBalance(balance, this.type);
		this.lasttxDate=LocalDate.now();
		this.balance-=amount;
	}
	public void transferAmt(double trfamount,BankAccount anotherAcc) throws InvalidInputException
	{
		this.withdraw(trfamount);
		anotherAcc.deposit(trfamount);
		
	}
	@Override
	public String toString() 
	{
		return "BankAccount [acctNo=" + acctNo + ", Cust_Name=" + Cust_Name + 
				", type=" + type + ", balance=" + balance
				+ ", creationDate=" + creationDate + ", "
				+ "lasttxDate=" + lasttxDate + ", isActive=" + isActive + "]";
	}
	
}
