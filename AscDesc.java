package Exercise2;

import java.util.Scanner;

public class AscDesc {
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("enter no of input to be given");
		int num= scan.nextInt();
		int arr[]= new int[num];
		for(int ctr=0; ctr<num;ctr++)
		{
			arr[ctr]=scan.nextInt();
		}//3 2 4 1 5
		int ctr=1,max=arr[0],min=arr[0];
		System.out.print("The Descending order is ");
		for(int ctr1=0;ctr1<arr.length;ctr1++)
		{
			int temp = arr[0]; // 2 4 5 3 1
			for(ctr=1;ctr<arr.length;ctr++) 
			 {
				if(arr[ctr-1]>arr[ctr])
				 {
					 arr[ctr-1]=arr[ctr];
					 arr[ctr]=temp;
				 }
				 else
				 {
					 temp=arr[ctr];
				 }
			 }	
		}	 	  
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.print("The Ascending order is ");
		for(int ctr1=0;ctr1<arr.length;ctr1++)
		{
			int temp = arr[0]; // 2 4 5 3 1
			for(ctr=1;ctr<arr.length;ctr++) 
			 {
				if(arr[ctr-1]<arr[ctr])
				 {
					 arr[ctr-1]=arr[ctr];
					 arr[ctr]=temp;
				 }
				 else
				 {
					 temp=arr[ctr];
				 }
			 }	
		}	 	  
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}
}
