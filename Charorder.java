import java.util.Scanner;

public class Charorder 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the string");
		String str= scan.nextLine().toLowerCase();
		char arr[]= str.toCharArray();
		for(int ctr1=0;ctr1<str.length();ctr1++)
		{
			for(int ctr=1;ctr<str.length();ctr++)//h=0, e=1,l=2,l=3,0=4
			{
				char temp =arr[ctr-1];//h,l,l
				if(arr[ctr-1]>arr[ctr]) 
				{// 0-1,1-2,2,3,3=4 //h>e,h>l
					arr[ctr-1]=arr[ctr];//0=e
					arr[ctr]=temp;//h
				}	
			}
		}
		for(char val:arr)
		{
			System.out.print(val);
		}
	}
}

