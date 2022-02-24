package Exercise2;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter input");
		int input = scan.nextInt();
		int count=0;
		int ctr=0;
		for(ctr=0;ctr<input/2;ctr++) { // traversing only to the mid point
			if(ctr*ctr==input) {
				count=1;
				break;
			}
			else
				continue;
		}
		if(count>0)
			System.out.print(input+" is a perfect square of "+ctr);
		else
			System.out.print(input+" is not a perfect square");
	}
}
