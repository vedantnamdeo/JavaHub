package ShowRoomManagementSystemWithList.core;

import static ShowRoomManagementSystemWithList.Utils.ShowroomUtils.findByChasisNo;
import static ShowRoomManagementSystemWithList.Utils.ShowroomValidationRules.validateAllInputs;
import static ShowRoomManagementSystemWithList.Utils.ShowroomValidationRules.validateColor;
import static ShowRoomManagementSystemWithList.Utils.ShowroomValidationRules.validateLocalDate;

import java.time.LocalDate;
import java.util.Collections;

import ShowRoomManagementSystemWithList.custom_exceptions.InvalidInputException;

public enum Color 
	{
		BLACK(10000),WHITE(15000),BLUE(20000),GREY(25000),SILVER(30000);
		
		private double price;
		private Color(double price)
		{
			this.price=price;
		}
		public double getAdditionalPrice()
		{
			return price;
		}
		
		public String toString()
		{
			return "Color:"+name()+" Price:$"+price;
		}

		
	}

/*
	
	
	case 1: 
		System.out.println("Enter color,date,chasisNo,company,price,");
		Vehicle v=validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), showroom);
		showroom.add(v);
		System.out.println("Vehicle added..");
		break;
case 2:
		for(Vehicle vehicle:showroom)
			System.out.println(vehicle);	
		break;
		
case 3:	System.out.println("Get Vehicle details ,by ChasisNo");
		System.out.println(findByChasisNo(sc.next(), showroom));
		break;
		
case 4: System.out.println("----Applying Discount----");
		v=findByChasisNo(sc.next(), showroom);
		System.out.println("Enter discount");
		double discount=sc.nextDouble();
		v.setprice(v.getprice()-(discount*v.getprice()));
		System.out.println("After Discount,Price:"+v.getprice());
		break;
		
case 5:	System.out.println("Discount on old Vehicles");
		LocalDate l=validateLocalDate(sc.next());
		double discountA=sc.nextDouble();
		for(Vehicle v1:showroom)
		{
			if(v1.getManufacturedate().isBefore(l))
				v1.setprice(v1.getprice()-(discountA*v1.getprice()));
			System.out.println("After Discount,Price:"+v1.getprice());
		}
		break;
		
case 6:
	System.out.println("Enter chasis no");
	boolean removed = showroom.remove(new Vehicle(sc.next()));
	if (removed)
		System.out.println("vehicle details removed");
	else
		throw new InvalidInputException("Vehicle details can't be removed : invalid chasis no!!!!");
	break;
case 7:
	System.out.println("Enter color:");
	Color c =validateColor(sc.next());
	for (Vehicle v2 : showroom)
		if (v2.getColor()==c)
			showroom.remove(v2);
	System.out.println("deleted vehicle details");
	break;
case 8:
		Collections.sort(showroom);
		
		break;
*/