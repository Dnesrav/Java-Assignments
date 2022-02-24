package Exercise2;

import java.util.Scanner;

public class StringChecker {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter input to be given");
		String str= scan.nextLine().toLowerCase();
		char arr[]= str.toCharArray();
		char UniqueArr[]=new char[str.length()];
		int ctr2=0;
		for(int ctr=0; ctr<str.length();ctr++)
		{
			int check=0;
			for(int ctr1=0; ctr1<UniqueArr.length;ctr1++)//hello
			{
				if(arr[ctr]==UniqueArr[ctr1])
				{
					check++;
					break;
				}	
			}
			if(check==0) 
			{	
				if(arr[ctr]>=97&&arr[ctr]<=122)
				{
					UniqueArr[ctr2++]=arr[ctr];
				//	ctr2++;
				}
			}
		}
		for(char input: UniqueArr)
		{
			System.out.print(input);
		}
		System.out.println();
// unique array found , checking occurence
		int temp[]=new int[arr.length];
		for(int ctr3=0; ctr3<UniqueArr.length;ctr3++)
		{
			int count=0;
			for(int ctr4=0; ctr4<arr.length;ctr4++)
			{
				if(UniqueArr[ctr3]==arr[ctr4])
				{
					count++;
				}
				else 
				{
					continue;
				}	
			}
			temp[ctr3]=count;
			if(UniqueArr[ctr3]!='\u0000')	
			System.out.println(UniqueArr[ctr3]+ " "+ count);
		}
		System.out.println("------------------------------------------------------");
		//for(int input: temp)
		//{
			//System.out.print(input);
		//}
		int ctr5=0,ctr6=0,max=temp[0],min=temp[0];
		while(ctr5<temp.length) 
		 {
			 if(temp[ctr5]!=0)
			 {
				 if(max<temp[ctr5])
				 {
					 max=temp[ctr5];
				 }
			 }
			 ctr5++; 
	     }
		 while(ctr6<temp.length) 
		 {
			 if(temp[ctr6]!=0)
			 {
				 if(min>temp[ctr6])
				 {
					 min=temp[ctr6];
				 } 
			 }
			 ctr6++;
	     }
		 for(int ctr7=0; ctr7<temp.length;ctr7++)
		 {
			 if(temp[ctr7]==min)
			 {
				 System.out.println(UniqueArr[ctr7] + " "+min);
			 } 
			 
			 if (temp[ctr7]==max)
			 {
				 System.out.println(UniqueArr[ctr7] + " "+max);
			 }	 
		 }
	}
}
