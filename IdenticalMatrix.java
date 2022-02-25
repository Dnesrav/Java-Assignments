import java.util.Scanner;

public class IdenticalMatrix {
	public static void checkIdentical(int arr[][],int rows,int cols) {
		int countOne=0,countZero=0;
		for(int ctr=0; ctr<rows; ctr++)
	    {
		    for( int ctr1=0; ctr1<cols; ctr1++)
		    {
		  	  	if(ctr==ctr1 )//1==1
		  	  	{
		  	  		if(arr[ctr][ctr1]!=1) //arr 1 1 =
		  	  			countOne++;//1 2   //0
		  	  	}
		  	  	else {
			  	  	if(arr[ctr][ctr1]!=0) //arr 1 2  
			  	  		countZero++;//1
		  	  	}
		    }
	    }
		if(countOne==0 && countZero==0)
			System.out.println("identical");
	    else
	    	System.out.println("not identical");
		
	}

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
    	System.out.println("Enter the rows:");
	    int rows =scn.nextInt();
	    System.out.println("Enter the cols");
	    int cols =scn.nextInt();
	    int arr1[][]= new int [rows][cols];
	    System.out.println("Enter values for arr1:");
	    for( int ctr=0; ctr<rows; ctr++)
	    {
		    for( int ctr1=0; ctr1<cols; ctr1++)
		    {
		  	  arr1[ctr][ctr1] = scn.nextInt();  	  	 
		    }
	    }
	    if(rows==cols)
	    	checkIdentical(arr1,rows,cols);
	    else
	    	System.out.println("not identical");
	}

}
