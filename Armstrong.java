package exercise1;

import java.util.Scanner;

public class Armstrong {
	public static void addCube(String num)
	{
		int value=0;
		for(int ctr=0;ctr<num.length();ctr++)
		{ // ascii value of numbers starts from (48-57)for(0-9) so i did minus from 48
			int cube=num.charAt(ctr)-48; // while storing the char value to integer it was storing the ascii value of that char for 1 that is 49
			value+=cube*cube*cube;
		}
		if((String.valueOf(value)).equals(num)) // string.valueof will convert any datatype into string 
			System.out.println("The entered number "+num+" is an Armstrong number ");
		else
			System.out.println("The entered number "+num+" is not an Armstrong number ");
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number to see Armstrong number");
		String num= sc.next();
		addCube(num);	
	}
}
