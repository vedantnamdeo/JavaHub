package CustomerManagementSystem.ValidationRules;
import java.time.LocalDate;
import java.time.Period;
//import java.util.regex.*;
import java.util.List;

import CustomerManagementSystem.Custom_Exceptions.InvalidInputException;
import CustomerManagementSystem.core.Customer;
import CustomerManagementSystem.core.ServicePlan;
import ShowRoomManagementSystemWithList.custom_exceptions.InvalidArguementException;

public class CustomerValidationRules 
{
	public static ServicePlan validatePlans(String plan) throws InvalidArguementException
	{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static LocalDate validateLocalDate(String date) throws InvalidInputException
	{
		LocalDate dob=LocalDate.parse(date);
		return dob;
//		Period p=Period.ofYears(18);
	}
//	public static Period validateEligibilty(LocalDate d,)
//	{
//		validateLocalDate(d)
//	}
	
	public static void validateRegistrationAmount(double registration_Amount,ServicePlan plan)
	throws InvalidInputException
	{
//		double PlanCost=ServicePlan.valueOf(plan).getPlan();
		if(registration_Amount<plan.getPlanCost())
			throw new InvalidInputException("Registration Amount is not sufficient Plan Cost");
		else
			
		System.out.println("Eligible for the Plan");
		
	}
	public static boolean hasNotPaidFor3Months(Customer cc) throws InvalidInputException
	{
	
		LocalDate currentDate=LocalDate.now();
		LocalDate LastSubscriptionDate=cc.getLastSubscriptionDate();
		Period p=Period.between(LastSubscriptionDate,currentDate);
		
		return p.toTotalMonths()>3;
	}
	public static void validateEmail(String email,String pass,List<Customer> customer) throws InvalidInputException
	{
//		 public boolean matches(String regEx)
		String pattern="^[a-z]+[A-Z0-9]+@[a-z]+\\.(com|org|net)$";
		if(!email.matches(pattern))
			throw new InvalidInputException("Invalid email pattern.");
		
		String patternPwd="^[a-z]+[A-Z]+[#@$%*\\-]+[0-9]$";
		if(!pass.matches(patternPwd))
			throw new InvalidInputException("Invalid password pattern..");
		
		Customer cust=new Customer(email);
		if(customer.contains(cust))
			throw new InvalidInputException("Existing EmailID...\n Cannot Add Customer");
		
	}
	
	public static Customer validateAllInputs(String date,String p,double registration_Amount
			,String fname,String lname,String email,String password,List<Customer> customer)
					throws InvalidArguementException,InvalidInputException
	{
		ServicePlan plan=validatePlans(p);
		LocalDate dob=validateLocalDate(date);
		validateEmail(email,password, customer);
		validateRegistrationAmount(registration_Amount,plan);
		Customer c4=new Customer(fname,lname,email,password,registration_Amount,dob,plan);
	
		return c4;
	}
}

/*2000-10-22
silver
1000
vedant
namdeo
vedant123@gmail.com
xyzZ#1

2004-06-08
gold
2000
shikhar
rawat
shikhar123@gmail.com
zxcS#1



import java.time.LocalDate;
import java.time.Period;

public class SubscriptionEligibility {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1990, 5, 15); // Replace with the person's birthdate
        LocalDate currentDate = LocalDate.now();

        // Define the required age as a Period (e.g., 18 years)
        Period requiredAge = Period.ofYears(18);

        // Calculate the age difference
        Period ageDifference = Period.between(birthdate, currentDate);

        // Check if the person is eligible for a subscription
        if (ageDifference.getYears() >= requiredAge.getYears()) {
            System.out.println("Eligible for the subscription!");
        } else {
            System.out.println("Not eligible for the subscription.");
            
*/