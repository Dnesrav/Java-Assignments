package exercise1;

import java.util.Scanner;

public class Factorial {
	public static void getFact(int num)
	{
		// as the formula , multiplies the series of digit , if the declared variable for storing the multiplied value is initialized to 0
		// 0 multiplied by anything will be 0 , so initialized it as 1
		int count=1;// for storing the multiplied value
		for(int ctr=1;ctr<=num;ctr++)
		{
			count*=ctr;	
		}
			System.out.print(count);
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to see factorial number");
		int num= sc.nextInt();
		getFact(num);	
	}
}
