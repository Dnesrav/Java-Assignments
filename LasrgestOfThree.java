import java.util.Scanner;

public class LasrgestOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number1");
		int num1 = scan.nextInt();
		System.out.println("enter the number2");
		int num2 = scan.nextInt();
		System.out.println("enter the number3");
		int num3 = scan.nextInt();
		for(int ctr=0;ctr<3;ctr++)
		{
			int temp=num1;
			if(num1>num2) { //2 1 3
				num1=num2;
				num2=temp;
			}
			else
			{
				temp=num2;
				if(num2>num3) { //2 3 1
					num2=num3;
					num3=temp;
				}
			}
		}
	System.out.println("Larget number is    "+num3);
	System.out.println("Smallest number is  "+num1);	
	}
}
