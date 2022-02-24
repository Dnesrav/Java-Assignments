import java.util.Scanner;

public class DuckNum {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the input");
		int num1= scan.nextInt();//3270
		int count=0;
		if(num1>0) {
			String num2= (String.valueOf(num1));//4
			if(num2.charAt(0)=='0')
			{
				System.out.print("No Duck");
			}
			else
			{
				for(int ctr=1;ctr<num2.length();ctr++)
				{
					if(num2.charAt(ctr)=='0')
						count=1;
						break;
				}
				if(count!=0)
					System.out.print("Duck");
				else
					System.out.print("No Duck");	
			}
		}
		else
			System.out.print("No duck");

	}

}
