package Exercise2;

import java.util.Scanner;

public class TechNum {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter input to bt muliblied by");
		int technumber= scan.nextInt();//2025
		int digit=0,mod=1;
		int lastDigit=0,firstDigit=0,value=0;
		String len=String.valueOf(technumber);
		if((len.length())%2==0) {//even odd
			digit=len.length()/2;	//4/2=2 //6/2=3
			for(int ctr=1;ctr<=digit;ctr++)
			{
				mod*=10;
			}
			lastDigit=technumber%mod;//2025%100=25
			firstDigit=technumber/mod;//2025/100=20
			value=(firstDigit+lastDigit)*(firstDigit+lastDigit);
			if(technumber-value==0)
				System.out.print(" tech number");
			else
				System.out.print(" not tech number");
		}
		else
			System.out.print(" will work for only even digits");
	}
}


