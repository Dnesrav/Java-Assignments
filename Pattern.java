package Exercise2;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter input");
		int input = scan.nextInt();
		for(int ctr=0;ctr<input;ctr++)
		{
			for(int ctr1=0;ctr1<=ctr;ctr1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
