package exercise1;
import java.util.*;
public class WordSplitter {

	public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the sentence");
      String val = scn.nextLine();
      String arr[]= new String[5];
      int space=0,count=0;
      // this loop is for finding how many space is there in the sentence
      for(int ctr3=0;ctr3<val.length();ctr3++) {
    	  if(val.charAt(ctr3)==' ') {
    		count++; 
    	  }
      }
    
      for(int ctr1=0;ctr1<=count;ctr1++)
      {
    	  String temp="";
    	  for(int ctr=space;ctr<val.length();ctr++) {
        	  if(val.charAt(ctr)!=' ') {
        		temp+= val.charAt(ctr);   		
        	  }
        	  else {
        		  space=ctr+1;
        		  break;
        	  }	 
          }  
    	  for(int ctr2=temp.length()-1;ctr2>=0;ctr2--)
    	  {
    		  System.out.print(temp.charAt(ctr2));
    	  }
    	  System.out.print(" "); 
      } 
   }
}

