package exercise1;

import java.util.Scanner;

public class PalindromeText {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the text");
		String input=scan.nextLine();
		StringBuffer text = new StringBuffer(input);
		String reversed =text.reverse().toString();
		if(reversed.equals(input))
			System.out.print("The text is Palindrome");
		else
			System.out.print("The text is not Palindrome");
	}

}
