package ShowroomManagementSystem;
import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import ShowroomManagementSystem.CarDetailsMismatchException;
public class Vehicle 
{
	private String chasisNo,company;
	private Color color;
	private double basePrice;
	public boolean isAvailable;
	private LocalDate Manufacturedate;
	
	
	public Vehicle(String cNo,String cnm,double bpr,boolean isAvailable,Color col,LocalDate mdate)
	{
		chasisNo=cNo;
		company=cnm;
		color=col;
		basePrice=bpr+color.getPrice();
		this.isAvailable=isAvailable;
		
		Manufacturedate=mdate;
		
	}
	
	
	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", company=" + company + ", color=" + color + ", Total Price="
		+ basePrice + ", isAvailable=" + isAvailable + ", date=" + Manufacturedate + "]";
	}
//	public void addVehicle()
//	{
//		if(isAvailable==true)
//			System.out.println("Vehicle is available");
//		else
//			throw 
//	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Vehicle)
		{
			Vehicle v=(Vehicle)obj;
			return this.chasisNo.equals(v.chasisNo);//Checks if chasisNo is same or not for Vehicles
			
				
		}
		return false;
		
	}
	
	
	
	
	
}
