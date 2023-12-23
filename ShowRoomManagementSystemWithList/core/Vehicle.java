package ShowRoomManagementSystemWithList.core;

import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.lang.Comparable;
public class Vehicle implements Comparable<Vehicle>
{
	private String chasisNo,company;
	private Color color;
	private double price;
	public boolean isAvailable;
	private LocalDate Manufacturedate;
	
	
	public Vehicle(String cNo,String cnm,double bpr,Color col,LocalDate mdate)
	{
		chasisNo=cNo;
		company=cnm;
		color=col;
		price=bpr;
		Manufacturedate=mdate;
		isAvailable=true;
		
		
	}
	public Vehicle(String chasisNo)
	{
		this.chasisNo=chasisNo;
	}
	
	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", company=" + company + ", color=" + color + ", Total Price="
		+ (price+ color.getAdditionalPrice()) + ", isAvailable=" + isAvailable + ", date=" + Manufacturedate + "]";
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Vehicle)
		{
			
			return this.chasisNo.equals(((Vehicle)obj).chasisNo);//Checks if chasisNo is same or not for Vehicles
		}
		return false;	
	}
	
	public int compareTo(Vehicle anotherVehicle)
	{
		System.out.println("--compareTo--");
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
	}
	
	public double getprice()
	{
		return price+color.getAdditionalPrice();
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public LocalDate getManufacturedate() {
		return Manufacturedate;
	}
	public void setManufacturedate(LocalDate manufacturedate) {
		Manufacturedate = manufacturedate;
	}
	
	
}
