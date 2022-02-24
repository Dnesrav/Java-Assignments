package Exercise2;

import java.util.Scanner;

public class PatternInverted {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter input");
		try {
			int input = scan.nextInt();
			for(int ctr=1;ctr<=input;ctr++)
			{
				for(int ctr1=1;ctr1<=ctr;ctr1++)
				{
					System.out.print(6-ctr1+" ");
				}
				System.out.println();
			}
		}
		catch(IllegalArgumentException obj) {
			System.out.print(obj);
		}
		catch(Exception obj1) {
			System.out.print(obj1);
		}
	}

}