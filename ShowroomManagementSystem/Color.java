package ShowroomManagementSystem;

import java.time.LocalDate;

public enum Color 
{
	BLACK(10000),WHITE(15000),BLUE(20000),GREY(25000);
	
	private double price;
	private Color(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Color:"+name()+" Price:$"+price;
	}

	
}
