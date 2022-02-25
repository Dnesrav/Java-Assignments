import java.util.Scanner;

public class UnionArray {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array1:");
	    int size =scan.nextInt();
	    int arr[]= new int [size];
	    System.out.println("Enter values of arr1:");
	    for( int ctr=0; ctr<size; ctr++)
	    {
	  	  arr[ctr] = scan.nextInt();  	  	 
	    }	 
	    System.out.println("Enter the size of array2:");
	    int size1 =scan.nextInt();
	    int arr1[]= new int [size];
	    System.out.println("Enter values of arr2:");
	    for( int ctr1=0; ctr1<size1; ctr1++)
	    {
	  	  arr1[ctr1] = scan.nextInt();  	  	 
	    }	 
	    int ctr2=0;
	    int UniqueArr[]=new int[size];
	    
	    for(int ctr=0; ctr<arr.length;ctr++)
		{ int check=0;
		    for( int ctr1=0; ctr1<size; ctr1++)
		    {
		    	if(arr[ctr]==UniqueArr[ctr1])
				{
					check++;
					break;
				}	
			}
			if(check==0) 
			{	
			UniqueArr[ctr2]=arr[ctr];
			System.out.print(UniqueArr[ctr2]+" ");
			ctr2++;
	    	}	
		}	    
	    for(int ctr3=0;ctr3<arr1.length;ctr3++) 
	    {
	    	int count1=0;
	    	for(int ctr4=0;ctr4<ctr2;ctr4++) 
	    	{
	    		if(arr1[ctr3]==UniqueArr[ctr4]) 
	    		{
	    			count1++;
	    		}
	    	}
	    	if(count1==0)
			System.out.print(arr1[ctr3]+" ");
	    }
	}
}
