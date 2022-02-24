package exercise;
import java.util.Scanner;
//reversing an array
public class Reverse {
	public static void reversed(int arr1[])
	{
		for(int ctr=arr1.length-1; ctr>=0;ctr--)// initializing from last
		{
			System.out.print(arr1[ctr]+" ");
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
		System.out.print("The reversed array is ");
		reversed(arrayInput);
	}
}
