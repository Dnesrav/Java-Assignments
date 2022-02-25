import java.util.Scanner;

public class RightShift {
	public static void shiftArr(int arr[],int times) 
	{
		int check=arr.length;
		for( int ctr=0; ctr<times; ctr++) {
			int temp=arr[check-1];
			for( int ctr1=check-1; ctr1>0; ctr1--) //1 2 3 4 
		    {
		  	  arr[ctr1]=arr[ctr1-1];  	 
		    }	
			arr[0]=temp;
			for(int val:arr)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
	    Scanner scn= new Scanner(System.in);
    	System.out.println("Enter the size of array:");
	    int size =scn.nextInt();
	    int arr[]= new int [size];
	    System.out.println("Enter values:");
	    for( int ctr=0; ctr<size; ctr++)
	    {
	  	  arr [ctr] = scn.nextInt();  	  	 
	    }	 
	    System.out.println("Enter number of times:");
	    int times =scn.nextInt();
	    shiftArr(arr,times);
	}

}
