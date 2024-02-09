import java.util.Scanner;

public class HollowSquare
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows:");
		int m=sc.nextInt();
		System.out.println("Enter no. of columns:");
		int n=sc.nextInt();
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=0 && i!=m-1 && j>0 && j<n-1)
					System.out.print(" ");
				else
					System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
		
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				if(i>0 && i<(m-1) && j>0 && j<(n-1))
//				System.out.print("  ");
//				else
//					System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		

//public class HollowSquare
//{
//
//	public static void main(String[] args)
//	{
//		for(int i=0;i<6;i++)
//		{
//			for(int j=0;j<6;j++)
//			{
//				if(i>0 && i<5 && j>0 && j<5)
//				System.out.print("  ");
//				else
//					System.out.print(" *");
//			}
//			System.out.println();
//		}
//
//	}
//
//}
