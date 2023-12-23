package ShowRoomManagementSystemWithList.core;
import java.util.Comparator;
public class VehiclePriceComparator implements Comparator<Vehicle>
{
	public int compare(Vehicle v1,Vehicle v2)
	{
		if(v1.getprice()<v2.getprice())
			return -1;
		if(v1.getprice()==v2.getprice())
			return 0;
		
		return 1;
	}
}
