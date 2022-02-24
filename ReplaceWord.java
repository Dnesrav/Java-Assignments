package Exercise2;

import java.util.Scanner;
/*code to replace a letter 'a' with 'the' when a is found*/

public class ReplaceWord {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your input");
		String text = scan.nextLine();		
		//char space=' ';
		for(int ctr=0;ctr<text.length();ctr++)
		{
			if(text.charAt(ctr)=='a')
			{
				System.out.print("the");
				continue;
			}
			System.out.print(text.charAt(ctr));
		}
	}

}