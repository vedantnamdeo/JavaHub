import java.util.Scanner;
public class Armstrong 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int arm=0;
		int temp=a;
		while(a!=0)
		{
			int r=a%10;
			
			arm=arm+r*r*r;
			a=a/10;
			
			
		}
		System.out.println("sum of cube of digits is "+arm);
		
		if(temp==arm)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
