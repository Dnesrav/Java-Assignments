package Exercise2;

import java.util.Scanner;

public class MidReverse {
	public static void reversed(int arr1[])
	{
		int mid=arr1.length/2;
		int newArr[]=new int[arr1.length];
		if((arr1.length%2)!=0) // odd length
		{
			newArr[mid]=arr1[mid];
			for(int ctr=mid-1; ctr>=0;ctr--) // this is for assigning values from mid  towards left
			{
				newArr[ctr]=arr1[mid+1];
				mid++;
			}
			int mid1=arr1.length/2;
			for(int ctr=mid1+1; ctr<arr1.length;ctr++) // this is for assigning values from mid  towards right
			{
				newArr[ctr]=arr1[mid1-1];
				mid1--;
			}
		}
		else {// even length
			for(int ctr=mid-1; ctr>=0;ctr--) // this is for assigning values from mid  towards left
			{
				newArr[ctr]=arr1[mid];
				mid++;
			}
			int mid1=arr1.length/2;
			for(int ctr=mid1; ctr<arr1.length;ctr++) // this is for assigning values from mid  towards right
			{
				newArr[ctr]=arr1[mid1-1];
				mid1--;
			}
		}
		for(int val:newArr) {
			System.out.print(val+ " ");
		}
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter no of input to be given");
		int num= scan.nextInt();
		int arrayInput[]= new int[num];
		for(int ctr=0; ctr<num;ctr++)
		{
			arrayInput[ctr]=scan.nextInt();
		}
		System.out.print("The original array is ");
		for(int val:arrayInput) {
			System.out.print(val+ " ");
		}
		System.out.println();
		System.out.print("The reversed array is ");
		reversed(arrayInput);
	}

}
