import java.util.Scanner;

public class SwapUptoALimit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("---Elements before change---");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
//		System.out.println("\nEnter start,end index");
//		int doneArr[]=alter(arr,sc.nextInt(),sc.nextInt());
		System.out.println("\nEnter upto how many elements:");
		int doneArr[]=alter2(arr,sc.nextInt());
		System.out.println("After change:");
		for(int i:doneArr)
		{
			System.out.print(i+" ");
		}

	}
	public static int[] alter(int arr[],int start,int end)
	{
		for(int s=start;s<end;s++)
		{
			int temp=arr[s];
			arr[s]=arr[end];
			arr[end]=temp;
			end--;
		}
		return arr;
	}
	public static int[] alter2(int arr[],int z)
	{
		
		int end=z-1;
	
		for(int start=0;start<end;start++)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			end--;
		}
		return arr;
	
	}
}
