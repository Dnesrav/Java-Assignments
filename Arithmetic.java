package exercise;

import java.util.Scanner;
/*code to break sentence to next line when space is found*/

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your input");
		String text = scan.nextLine();		
		//char space=' ';
		for(int ctr=0;ctr<text.length();ctr++)
		{
			if(text.charAt(ctr)==' ')
			{
				System.out.println();
				continue;
			}
			System.out.print(text.charAt(ctr));
		}
	}

}