import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int ctr=0;ctr<size;ctr++)
		{
			arr[ctr]=scan.nextInt();//11 12 13 14 15
		}
		
		System.out.print("How many times you wish to rotate? ");
		int noOfTimes=scan.nextInt();
		for(int ctr2=1;ctr2<=noOfTimes;ctr2++)
		{
			int temp=arr[0];//13
			for(int ctr1=1;ctr1<size;ctr1++)
			{
				arr[ctr1-1]=arr[ctr1];//0=1,1=2,2=3,3=4
			}
			arr[size-1]=temp;
			for(int val:arr)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}
