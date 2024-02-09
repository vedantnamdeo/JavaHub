import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class HalfTriangle1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row,col:");
		int size=sc.nextInt();
//		int n=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size+1-i;j++)
			{
				
					System.out.print("*");
					
			}
			
			
			System.out.println();
		}
	

	}

}
