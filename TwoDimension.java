package exercise1;

import java.util.Scanner;

public class TwoDimension {
	public static void check(int arr[][],int rows, int cols) {
		int odd=0,even=0;
		for(int ctr=0;ctr<rows;ctr++)
		{
			for(int ctr1=0;ctr1<cols;ctr1++)
			{
				if(arr[ctr][ctr1]%2==0)
					even++;
				else
					odd++;
			}
		}
		System.out.println("The number of odd number in given array is "+odd);
		System.out.println("The number of even number in given array is "+even);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the row ");
		int row=scan.nextInt();
		System.out.print("Enter the col ");
		int col=scan.nextInt();
		int arr[][]=new int[row][col];
		for(int ctr=0;ctr<row;ctr++)
		{
			for(int ctr1=0;ctr1<col;ctr1++)
			{
				arr[ctr][ctr1]=scan.nextInt();
			}
		}
		check(arr,row,col);
	}

}
