package CustomerManagementSystem.ValidationRules;
import CustomerManagementSystem.Custom_Exceptions.InvalidInputException;
import CustomerManagementSystem.core.*;
import java.util.List;
public class CustomerUtils 
{
	public static Customer Authenticate(String email,String pass,List<Customer> list)
	throws InvalidInputException
	{
		Customer cu=new Customer(email);
		int index=list.indexOf(cu);
		if(index==-1)
			throw new InvalidInputException("Login Failed.\\nInvalid EmailID.Please enter again..");
		Customer c=list.get(index);
		
			
		if(!c.getPassword().equals(pass))
			throw new InvalidInputException("Login Failed.\\nWrong Password");
		
		return c;
			
	}
}
