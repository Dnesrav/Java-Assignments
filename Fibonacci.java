package exercise1;

import java.util.Scanner;

public class Fibonacci {
	public static void add(int num)
	{
		// the formula is frist digit+second digit= third digit, second digit+third=fourth digit
		//starts with 0 and 1 so i have initialized first two values of array as 0, 1
		int next[]=new int[num]; 
		next[0]=0;
		next[1]=1;
		for(int ctr=1;ctr<next.length-1;ctr++)
		{
			next[ctr+1]=next[ctr-1]+next[ctr];	
		}
		// enhanced for loop is used , print all values in the array without any alteration/condition
		for(int val:next)
		{
			System.out.print(val+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to see fibonacci series");
		int num= sc.nextInt();
		add(num);	
	}
}
