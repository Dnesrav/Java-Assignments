package Exercise2;

import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.print("enter the string");
	String str= scan.nextLine();
	int size=str.length();
	System.out.print("How many letters you want to split?");
	int part=scan.nextInt();//3
	//int len=str.length()/part;
	int rem=size%part;
	String temp="";
	for(int ctr=0;ctr<size-rem;ctr+=part) 
	{
		for(int ctr1=ctr+part-1;ctr1>=ctr;ctr1--) 
		{
			temp+=str.charAt(ctr1);
		}		
		System.out.print(temp+" ");
		temp="";
	}
	
	for(int ctr2=1;ctr2<=rem;ctr2++) {
		System.out.print(str.charAt(size-ctr2));
	}
}}

