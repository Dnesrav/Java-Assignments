package exercise1;

import java.util.Scanner;

public class Palindrome {
	public static int reverse(int num)
	{
		int last=0,reverse=0;
		while(num>0)  
		{
			last=num%10;   
			reverse=reverse*10+last;	
			num=num/10; 
			
		}
		return reverse;
		
	}
	
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter number");
		int num= sc.nextInt();
		
		System.out.println("the reversed number is "+ reverse(num));
		System.out.println((num==reverse(num))?"This is Palindrome number":"This is not palindrome number");
	}

}
