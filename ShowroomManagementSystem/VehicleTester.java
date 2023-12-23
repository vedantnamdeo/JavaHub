package ShowroomManagementSystem;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import ShowroomManagementSystem.Vehicle;
import ShowroomManagementSystem.CarDetailsMismatchException;
public class VehicleTester 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			LocalDate fixed=LocalDate.parse("2021-01-01");
//			System.out.println(fixed.getClass());
//			for(Color i:Color.values())
//			{
//				System.out.println(i);
//			}
			
//			Color c1[]=Color.values();
//			for(Color c:c1)
//			{
//				System.out.println(c+" at index "+c.ordinal());
//			}
			
			System.out.println("Enter Manufacturing date:");
			LocalDate ld=LocalDate.parse(sc.next());
			Vehicle v,v1;
			if(ld.isAfter(fixed))
			{
				System.out.println("enter \n1.ChasisNo  \n2.Company Name \n3.Base Price  \n4.Availability \n5.Color  \n6.Manufacture date");
				 v=new Vehicle(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean(),Color.valueOf(sc.next().toUpperCase()),ld);
				
				System.out.println(v);
			}
			
			else
				throw new DateExpiredException("Manufacturing date is not after 1 Jan 2021");
				
			System.out.println("Enter Manufacturing date:");
			LocalDate ld1=LocalDate.parse(sc.next());
			v1=new Vehicle(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean(),Color.valueOf(sc.next().toUpperCase()),ld1);
			if(ld.isAfter(fixed))
			{
				if(v.equals(v1)==true)
					throw new CarDetailsMismatchException("Cars Chasis No is same. Choose another.\n");
				else
					System.out.println(v1);
			}
			else
				throw new DateExpiredException("Manufacturing date is not after 1 Jan 2021");
				
				
		}
		
		catch(CarDetailsMismatchException c)
		{
			System.out.println(c);
		}
		catch(DateExpiredException e)
		{
			System.out.println(e+". \nCannot Add This Vehicle");
		}

	}

}
