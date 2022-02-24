package exercise1;

import java.util.Scanner;

public class Even {
	public static void evenSeries(int num1,int num2)
	{
		for(int ctr=num1;ctr<=num2;ctr++)
		{
			if(ctr%2==0)
				System.out.print(ctr+" ");	
			else
				continue;
		}
	}	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("enter first number ");
		int startNum= scan.nextInt();
		System.out.print("enter second number ");
		int endNum= scan.nextInt();
		evenSeries(startNum,endNum);	
	}
}
