import java.util.Scanner;

public class Arrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
//		for(int i=1;i<=size;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<size;i++)
//		{
//			for(int j=1;j<size+1-i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for(int i=1;i<=2*size-1;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				System.out.print("*");
			}
		}System.out.println();
	}

}
