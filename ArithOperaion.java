package exercise1;

import java.util.Scanner;

public class ArithOperaion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number  ");
		int num1=scan.nextInt();
		System.out.println("Enter the second number  ");
		int num2=scan.nextInt();
		System.out.println("1.Addition ");
		System.out.println("2.subtraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("Enter your choice of operation  ");
		int value=0,select=scan.nextInt();
		switch(select) {
		case 1:
			System.out.println("The addition of "+num1+" and "+num2+" is "+ (num1+num2));	
			break;
		case 2:
			System.out.println("The subtraction of "+num1+" and "+num2+" is "+ (num1-num2));
			break;
		case 3:
			System.out.println("The Multiplication of "+num1+" and "+num2+" is "+ (num1*num2));
			break;
		case 4:
			System.out.println("The Division of "+num1+" and "+num2+" is "+(double)num1/num2);
			break;
		default:
			System.out.println("enter option between 1-4");
		}
	}
}
