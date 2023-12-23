package ShowRoomManagementSystemWithList.Utils;
import ShowRoomManagementSystemWithList.custom_exceptions.*;

import java.time.LocalDate;
import java.util.List;

import CustomerManagementSystem.Custom_Exceptions.InvalidInputException;
import ShowRoomManagementSystemWithList.core.*;
import ShowRoomManagementSystemWithList.tester.ShowroomManagementSystem;


public class ShowroomValidationRules 
{
	public static Color validateColor(String c) throws InvalidArguementException
	{
		return Color.valueOf(c.toUpperCase());
	}
	
	public static LocalDate validateLocalDate(String d) throws InvalidDateException
	{
		LocalDate manuDate=LocalDate.parse(d);
		LocalDate checkDate=LocalDate.parse("2021-01-01");
		if(manuDate.isBefore(checkDate))   //manufacture date must be after 1 Jan 2021
		{
			throw new InvalidDateException("Date is before 1 Jan 2021");
		}
		return manuDate;
	}
	public static void checkForDuplicates(String ch,List<Vehicle> vehicles) throws InvalidInputException
	{
		Vehicle anotherVehicle=new Vehicle(ch);
		if(vehicles.contains(anotherVehicle))
			throw new InvalidInputException("Duplicated ChasisNo!!");
	}
	
	public static Vehicle validateAllInputs(String col,String d,String chNo,String comName,double pr
			,List<Vehicle> vehicles) throws InvalidArguementException,InvalidDateException,InvalidInputException
	{
		Color validateColor=validateColor(col);
		LocalDate Validatemanudate=validateLocalDate(d);
		checkForDuplicates(chNo,vehicles);
	
		return new Vehicle(chNo,comName,pr,validateColor,Validatemanudate);
	}
}
