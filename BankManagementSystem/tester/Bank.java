package BankManagementSystem.tester;
import java.util.Scanner;
import static BankManagementSystem.utils.ValidationRules.*;

import BankManagementSystem.core.BankAccount;
import BankManagementSystem.core.BankAccount.*;
import BankManagementSystem.custom_exceptions.InvalidInputException;

import static BankManagementSystem.utils.BankUtils.*;
import java.util.Map;
public class Bank 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer,BankAccount> BankAcc=populateBank();
			boolean exit=false;
			while(!exit)
			{	
					System.out.println("1.Create A/C.\n2.Get A/C summary.\n"
							+ "3.Deposit.\n4.Withdraw.\n5.Transfer.\n"
							+ "6.Apply simple interest.\n"
							+ "7.Close A/C.\n8.Display all A/C.");
				System.out.println("--Choose--");
				try
				{
					switch(sc.nextInt())
					{
						case 1: System.out.println("Enter acctno,acct type,balance,customer Name,creation date,isActive");
								BankAccount b=validateAllInputs(sc.nextInt(),sc.next(), sc.nextDouble(),
								sc.next(),sc.next(),sc.nextBoolean(), BankAcc);
								System.out.println("Enter key");
								BankAcc.put(sc.nextInt(),b);
								System.out.println("Added Account");
								break;
								
						case 2: if(BankAcc==null)
								throw new InvalidInputException("Invalid acc/no");
								System.out.println("Enter key");
								System.out.println(BankAcc.get(sc.nextInt()));
								break;
						case 3: System.out.println("Enter key");
								BankAccount b1=BankAcc.get(sc.nextInt());
								System.out.println("Enter amount to deposit");
								b1.deposit(sc.nextDouble());
								break;
						case 4: System.out.println("Enter key");
								BankAccount b2=BankAcc.get(sc.nextInt());
								System.out.println("Enter amount to withdraw");
								b2.withdraw(sc.nextDouble());
								break;
						case 5: System.out.println("Enter key for sender");
								BankAccount src=BankAcc.get(sc.nextInt());
								if(src==null)
									throw new InvalidInputException("Invalid sender a/c no.");
								System.out.println("Enter key for receiver");
								BankAccount dest=BankAcc.get(sc.nextInt());
								if(dest==null)
									throw new InvalidInputException("Invalid receiver a/c no.");
								
								System.out.println("Enter amount to transfer");
								src.transferAmt(sc.nextDouble(), dest);
								break;
						case 6:
						case 8:	
								for(BankAccount bb:BankAcc.values())
								{
									System.out.println(bb);
								}
								break;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}

	}



}
