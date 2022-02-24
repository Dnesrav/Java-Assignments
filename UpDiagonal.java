package exercise1;

import java.util.Scanner;

public class UpDiagonal {
	public static void check(int arr[][],int rows, int cols) {
		for(int ctr=0;ctr<rows;ctr++)
		{
			for(int ctr1=ctr;ctr1<=cols;ctr1++)
			{
				System.out.print(arr[ctr][ctr1]);
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print((char)65);
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
