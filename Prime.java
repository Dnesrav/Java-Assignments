package exercise1;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.print("enter number");
		int num= Sc.nextInt();
		PrimeCheck obj = new PrimeCheck(); 
		boolean val = PrimeCheck.checkNumber(num);
		System.out.println("the number "+ num + " is "+(val == true ? "not prime" : "prime"));  
	}
}
	

