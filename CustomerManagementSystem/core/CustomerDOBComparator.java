package CustomerManagementSystem.core;
import java.time.LocalDate;
import java.util.Comparator;

public class CustomerDOBComparator implements Comparator<Customer> {
	
	public int compare(Customer c1,Customer c2)
	{
		if(c1.getDob().isBefore(c2.getDob()))
				return -1;
		if(c1.getDob().isEqual(c2.getDob()))
				return 0;
		return 1;
	}
}
