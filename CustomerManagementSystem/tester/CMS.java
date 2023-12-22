package CustomerManagementSystem.tester;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static CustomerManagementSystem.ValidationRules.CustomerValidationRules.*;
import static CustomerManagementSystem.ValidationRules.CustomerUtils.Authenticate;

import CustomerManagementSystem.Custom_Exceptions.InvalidInputException;
import CustomerManagementSystem.core.*;
public class CMS 
{

	public static void main(String[] args) 
	{
		 
		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> CMS=new ArrayList<>();
			boolean exit=false;
			
			int choice;
			while(!exit)
			{
				System.out.println("--Customer Management System--");
				System.out.println("1.Sign Up\n2.Sign In\n"
						+ "3.Change Password\n4.Unsubscribe\n"
						+ "5.Display Customers\n6.Sort Customers"
						+ "\n7.Sort Customers using DOB"
						+ "\n8.Sort using DOB and last name.\n"
						+ "9.Not paid Subscription for 3 months?Display Names.\n"
						+ "10.Remove those who didn't pay for over 6 months\n0.Exit");
				System.out.println("Enter choice");
				choice=sc.nextInt();
				try
				{
					switch(choice)
					{
						case 1:	System.out.println("Add Customer Details");
								System.out.println("Enter dob,plan, registration_Amount\r\n"
										+ ",fname,lname, email,"
										+ "password");
								Customer c=validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), 
										sc.next(), sc.next(), sc.next(), sc.next(), CMS);
										CMS.add(c);
										System.out.println("...Customer Details Added..");
										
								break;
						case 2:	System.out.println("Sign In");
								System.out.println("Enter emailID and password");
								Customer cc=Authenticate(sc.next(),sc.next() ,CMS);
								System.out.println("Logged In");
								System.out.println(cc.getFname());
								break;
						case 3:	System.out.println("Forgot Password?\n Enter last remembered password");
								System.out.println("Enter details:email,password");
								Customer c2=Authenticate(sc.next(),sc.next(), CMS);
								System.out.println("New Password");
								c2.setPassword(sc.next());
								System.out.println("Changed Password");
						
								break;
						case 4:	
								System.out.println("Do you want to unsubscribe?Y/N");
								System.out.println();
								char ch=sc.next().charAt(0);
								if(ch=='Y'||ch=='y')
								{
									System.out.println("Enter email & password:");
									Customer c3=Authenticate(sc.next(), sc.next(), CMS);
									CMS.remove(c3);
									System.out.println("Unsubscribed");
								}
								else if(ch=='N'||ch=='n')
								System.out.println("Cannot Unsubscribe");
									
								break;
						case 5: System.out.println("Displaying Customers..");
								if(CMS.isEmpty())
									System.out.println("No customers ");
								for(Customer c1:CMS)
								{
								
									System.out.println(c1);
								}	
								break;
						case 6: Collections.sort(CMS);
								System.out.println("Sorted");
								break;
						case 7: Collections.sort(CMS, new CustomerDOBComparator());
								System.out.println("Sorted using DOB");
								break;
						case 8: Collections.sort(CMS,new Comparator<Customer>()
								{
									public int compare(Customer a,Customer b)
									{
										int res=a.getLname().compareToIgnoreCase(b.getLname());
										if(res==0)
										{
											if(a.getDob().isBefore(b.getDob()))
													return -1;
											if(a.getDob().isEqual(b.getDob()))
												return 0;
										return 1;
										}
										return res;
									}
								});
								break;
								
						case 9: boolean found=false;
								for(Customer c1:CMS)
								{
									if(hasNotPaidFor3Months(c1))
									{
										System.out.println(c1.getFname()+" has not paid for 3 months");
										found=true;
									}
									
								}
								if(!found)
									System.out.println("No customer found with pending 3 months subscription");
								
								break;
						case 10: for(Customer ccc:CMS)
								break;
						case 0:
								exit=true;
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
