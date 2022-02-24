package exercise;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your input");
		String line = sc.nextLine();
		int vowel=0,cons=0,space=0; 
		for(int ctr=0;ctr<line.length();ctr++)
		{		
			if(((line.charAt(ctr)==(char)'a')||(line.charAt(ctr)=='e')||(line.charAt(ctr)=='i')||(line.charAt(ctr)=='o')||(line.charAt(ctr)=='u'))
					|| ((line.charAt(ctr)=='A')||(line.charAt(ctr)=='E')||(line.charAt(ctr)=='I')||(line.charAt(ctr)=='O')||(line.charAt(ctr)=='U')))
			{
				vowel++;
			}
			else
			{
				if(line.charAt(ctr)==' ')
					space++;
				else
					cons++;
			}	
		}
		System.out.println("The number of vowels is "+vowel+" and consonant is "+cons+" and space is "+space);
	}
}
