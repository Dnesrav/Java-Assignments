package exercise1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the year  ");
		int year=scan.nextInt();
		// as per gregorian formula, the year is a leap year if it is divisible by 4
		if(year%4==0)
		{
			// even though year divisible by 4 is a leap year, when comes for century year like 2100,2200,2300 
			// if and only if it is divisible by both 100 and 400 , it is a leap year 
			if((year%400!=0)||(year%100!=0))
			{
				System.out.print(year+" is not a leap year");
			}
			else 
				System.out.print(year+" is a leap year");
		}
		else
			System.out.print(year+" is not a leap year");	
	}
}
