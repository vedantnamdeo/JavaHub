package BankManagementSystem.utils;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import BankManagementSystem.core.AccountType;
import BankManagementSystem.core.BankAccount;

public class BankUtils 
{
	public static Map<Integer,BankAccount> populateBank()
	{
		Map<Integer,BankAccount> Account=new HashMap<>();
		System.out.println("Added.");
		Account.put(1,new BankAccount(100, "Vedant",AccountType.SAVINGS,25000 
				,LocalDate.parse("2020-10-11") , true));
		Account.put(2,new BankAccount(101, "Shikhar",AccountType.FD,15000 ,
				LocalDate.parse("2021-08-21") , true));
		
		return Account;
	}

}
