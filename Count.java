package exercise1;

import java.util.Scanner;

public class Count {
	public static int startCounter(int num1)
	{
		int count=0;
		for(int ctr=1;ctr<=num1;ctr++)
		{
			count+=ctr;
		}
		return count;
	}	
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the range ");
		int startNum= scan.nextInt();
		System.out.print(startCounter(startNum));	
		
	}
}
