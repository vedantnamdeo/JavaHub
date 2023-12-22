package CustomerManagementSystem.Custom_Exceptions;


public class InvalidDateException extends Exception
{
	public InvalidDateException(String msg) 
	{
		super(msg);
	}
}