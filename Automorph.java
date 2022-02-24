package Exercise2;

import java.util.Scanner;

public class Automorph {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter no of input to be given");
		int num= scan.nextInt();
		String len=String.valueOf(num);
		int answer=num*num;
		int value=0,mod=1;
		for(int ctr=1;ctr<=len.length();ctr++)
		{
			mod*=10;
		}
		value=answer%mod;		
		if(num-value==0)
			System.out.print("automorphic number");
		else
			System.out.print(" not automorphic number");
	}
}



