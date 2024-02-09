import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=1;i<=2*size-1;i++)
		{
			int col=i>size?size-(i-size):i;
			
			for(int j=1;j<col;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
