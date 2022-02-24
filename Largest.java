package exercise1;

import java.util.Scanner;

public class Largest {
 public static void findLargest(int arr[]) {
	 int ctr=1,temp=arr[0];
	 while(ctr<arr.length) 
	 {
		 if(temp<arr[ctr])
		 {
			 temp=arr[ctr];
		 }
		 ctr++;
     }
	 System.out.print("Largest Number in array is :" +temp);
    }
 	public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    try {
    	 System.out.println("Enter the size of array:");
    	    int size =scn.nextInt();
    	    int arr[]= new int [size];
    	    for( int ctr=0; ctr<size; ctr++)
    	    {
    	  	  arr [ctr] = scn.nextInt();  	  	 
    	    }	 
    	    findLargest(arr);
    	}
    catch (Exception obj)
    {
	   System.out.print("Please Enter only Integer va");
    }
   }
}