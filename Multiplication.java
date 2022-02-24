package Exercise2;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter input to bt muliblied by");
		int table= scan.nextInt();
		System.out.print("enter range");
		int range= scan.nextInt();
		int ctr=1;
		while(ctr<=range) 
		{
			System.out.println(table + " X "+ctr+" = "+table*ctr); 
			ctr++;
		}
	}

}
