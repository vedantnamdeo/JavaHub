package ShowRoomManagementSystemWithList.Utils;
import java.util.List;
import ShowRoomManagementSystemWithList.custom_exceptions.*;
import ShowRoomManagementSystemWithList.core.*;

public class ShowroomUtils 
{
	public static Vehicle findByChasisNo(String ch,List<Vehicle> list) throws InvalidInputException
	{
		Vehicle ve=new Vehicle(ch);
		int index=list.indexOf(ve);
		if(index==-1)
		{
			throw new InvalidInputException("Invalid ChasisNo ,Vehicle not Found!!");
		}
		//System.out.println(list.get(index));
		//return ve;
		return list.get(index);
	}
}
