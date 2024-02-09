import java.util.Scanner;

public class HalfTriangle2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row,col:");
		int size=sc.nextInt();
//		int n=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print("*");
					
			}
			
			
			System.out.println();
		}
	

	}

}
