package exercise1;

import java.util.Scanner;

public class odd {
	public static void Series(int num1,int num2)
	{
		for(int ctr=num1;ctr<=num2;ctr++)
		{
			if(ctr%2==0)
				continue;
			else
				System.out.print(ctr+" ");	
		}
	}	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first number ");
		int startNum= sc.nextInt();
		System.out.print("enter second number ");
		int endNum= sc.nextInt();
		Series(startNum,endNum);	
	}
}
