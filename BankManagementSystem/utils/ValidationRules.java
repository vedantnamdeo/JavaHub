package BankManagementSystem.utils;

import java.time.LocalDate;
import java.util.Map;

import BankManagementSystem.core.AccountType;
import BankManagementSystem.core.BankAccount;
import BankManagementSystem.tester.Bank;
import BankManagementSystem.custom_exceptions.InvalidInputException;

public class ValidationRules 
{
	public static AccountType ValidateAccType(String type) throws InvalidInputException
	{
		return AccountType.valueOf(type.toUpperCase());
	}
	public static LocalDate ValidateCrtDate(String date) throws InvalidInputException
	{
		return LocalDate.parse(date);
	}
	
	public static void ValidateBalance(double bal,AccountType type) throws InvalidInputException
	{
		if(bal<type.getMinBalance())
			throw new InvalidInputException("Balance insufficient");
		
	}
	public static BankAccount validateAllInputs(int acctNo,String type,double bal,String cname,String date
			,boolean isActive,Map<Integer,BankAccount> acc)
			throws InvalidInputException
	{
		if(acc.containsKey(acctNo))
			throw new InvalidInputException("Duplicate Account No.");
		LocalDate d=ValidateCrtDate(date);
		AccountType t= ValidateAccType(type);
		ValidateBalance(bal, t);
		BankAccount ba=new BankAccount(acctNo, cname, t, bal, d, isActive);
		return ba;
		
		
	}
}
