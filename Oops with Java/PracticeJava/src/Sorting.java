import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int temp;
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
//			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				//descending
//				if(arr[i]>arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
				//ascending
//				if(arr[j]>arr[i])
//				{
//					temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
				
				//Array Method
//				Arrays.sort(arr);
				
				
			}
		}
		for(int b:arr)
		{
			System.out.println(b);
		}
		
	}

}
