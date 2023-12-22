package CustomerManagementSystem.core;
import java.time.LocalDate;
import java.lang.Comparable;
public class Customer implements Comparable<Customer>
{
	private int customer_id;
	private String fname,lname,email,password;
	private double registration_Amount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionDate;
	public static int IDGen;
	static
	{
		IDGen=100;
	}
	public String getFname() 
	{
		return fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	
	
	public Customer(String fname, String lname, String email, String password,
			double registration_Amount, LocalDate dob, ServicePlan plan) 
	{
		super();
		this.customer_id = IDGen++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registration_Amount = registration_Amount;
		this.dob = dob;
		this.plan = plan;
		this.lastSubscriptionDate=LocalDate.now().minusMonths(4);
	}
	
	public LocalDate getLastSubscriptionDate() {
		return lastSubscriptionDate;
	}

	public void setLastSubscriptionDate(LocalDate lastSubscriptionDate) {
		this.lastSubscriptionDate = lastSubscriptionDate;
	}

	//PK-Email
	public Customer(String email)
	{
		this.email=email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", registration_Amount=" + registration_Amount + ", dob=" + dob + ", plan="
				+ plan + ", lastSubscriptionDate=" + lastSubscriptionDate + "]";
	}

	@Override
	public int compareTo(Customer anotherCustomer)
	{
		return this.email.compareToIgnoreCase(anotherCustomer.email);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(password);
//	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Customer)
		{
			Customer other = (Customer) obj;
			return this.email.equals(other.email);
		}
		return false;
	}
	
}

