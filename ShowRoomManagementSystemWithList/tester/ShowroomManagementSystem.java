package ShowRoomManagementSystemWithList.tester;
import java.util.Scanner;

import ShowRoomManagementSystemWithList.custom_exceptions.*;
import ShowRoomManagementSystemWithList.core.*;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import static ShowRoomManagementSystemWithList.Utils.ShowroomValidationRules.*;

import static ShowRoomManagementSystemWithList.Utils.ShowroomUtils.findByChasisNo;
import ShowRoomManagementSystemWithList.core.VehiclePriceComparator;
public class ShowroomManagementSystem 
{

	public static void main(String[] args) 
	{
		
			try(Scanner sc=new Scanner(System.in))
			{
				List<Vehicle> showroom=new ArrayList<>(); //create a Showroom to store Vehicles
				
				int choice;
				boolean exit=false;
				while(!exit)
				{
					System.out.println("1.Add Vehicles\n2.Display all vehicles\n"
							+ "3.Get Vehicle Details\n4.Apply discount"
							+ "\n5.Apply discount on Old Vehicles"
							+ "\n6.Remove Specific Vehicle\n7.Remove Vehicle Based on Color\n"
							+ "8.Sort Vehicle as per chasisNo"
							+ "\n9.Sort Vehicle as per price"
							+ "\n10.Sort Vehicle as per date & price\n0.Exit");
					System.out.println("Enter your choice:");
					choice=sc.nextInt();
					try 
				
					{
						switch(choice)
						{
						case 1: System.out.println("Enter color,date,chasisNo,company Name,price");
								Vehicle v=validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), showroom);
								showroom.add(v);
								System.out.println("Vehicle Added");
								break;
						case 2: System.out.println("Vehicle details");
								for(Vehicle v1:showroom)
									System.out.println(v1);
								break;
						case 3: System.out.println("Getting vehicle details using ChasisNo");
								System.out.println("Enter chasisNo:");
								Vehicle v2=findByChasisNo(sc.next(), showroom);
								System.out.println(v2);
								break;
						case 4:	System.out.println("Applying Discount of");
								double discount=sc.nextDouble();
								System.out.println("Enter chasis No");
								Vehicle v3=findByChasisNo(sc.next(), showroom);
								v3.setprice(v3.getprice()-(discount*v3.getprice()));
								System.out.println("After discount,Price:"+v3.getprice());
								break;
						case 5: System.out.println("Enter date:");	
								LocalDate ld=validateLocalDate(sc.next());
								System.out.println("Applying Discount on old vehicle of");
								double discount1=sc.nextDouble();
								for(Vehicle veh:showroom)
								{
									if(veh.getManufacturedate().isBefore(ld))
										veh.setprice(veh.getprice()-(discount1*veh.getprice()));
								}
								System.out.println("Discount Applied..");
								break;
						case 6:	System.out.println("Enter chasisNo to remove:");
								boolean removed=showroom.remove(new Vehicle(sc.next()));
								if(removed)
									System.out.println("Removed Vehicle using chasisNo");
								else
									throw new InvalidInputException("..Wrong ChasisNo,Cannot remove Vehicle...");
						
								break;
						case 7:	System.out.println("Enter color to remove Vehicle ");
								Color col=validateColor(sc.next());
								Iterator<Vehicle> itr=showroom.iterator();
								while(itr.hasNext())
								{
									if(itr.next().getColor()==col)
										itr.remove();
								}
								System.out.println("Removed Vehicle of color"+col);
								
								break;
						case 8:	System.out.println("Sorting :"); //compareTo is used here
								Collections.sort(showroom);
						
								break;
								
						case 9:	Collections.sort(showroom,new VehiclePriceComparator()); //passing instance of class that implements comparator
								break;
						
					   case 10: Collections.sort(showroom,new Comparator<Vehicle>() //anonymous inner class
								   {
									  public int compare(Vehicle o1,Vehicle o2)
									  {
										  int res=o1.getManufacturedate().compareTo(o2.getManufacturedate());
										  if(res==0)
										  {
											  if(o1.getprice()<o2.getprice())
												  return -1;
											  if(o1.getprice()==o2.getprice())
												  return 0;
											  return 1;
											  
										  }
										  return res;
									  }
								   });
									break;
									
						case 0: System.out.println("..Exiting....");
								exit=true;
								
								break;
						}
					}
					catch(Exception e)
					{
						sc.nextLine();
						e.printStackTrace();
					}
					
				}
		
			}
				
	}

}


//Sample Inputs:-
//white 2023-10-21 123 toyota 100000
//black 2022-07-04 1234 mahindra 200000
//black 2022-07-04 12345 mahindra 200000
//blue 2021-06-01 123456 tata 300000
//white 2023-10-21 12334 toyota 5000
