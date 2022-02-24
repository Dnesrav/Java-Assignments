package Exercise2;

import java.util.*;



public class Duck {

	public static void main(String[] args) {
		
      Scanner scn = new Scanner(System.in);
      System.out.println("enter the sentence");
      String val = scn.nextLine();
      String arr[]= new String[5];
      
      int space=0;
      for(int ctr1=0;ctr1<=space;ctr1=space)
      {
    	  String temp="";
    	  for(int ctr=ctr1;ctr<val.length();ctr++) {// hello all learners  17
        	  if(val.charAt(ctr)!=' ') {
        		temp+= val.charAt(ctr);
        	  }
        	  else {
        		  space=ctr+1;
        		  ctr1=0;
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