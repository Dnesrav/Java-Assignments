import java.util.Scanner;

public class Krishna {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter range to see Krishnamoorthy number");
		int numRange= sc.nextInt();
		for(int ctr=1;ctr<numRange;ctr++) // range loop
		{
			int copy=ctr;	// while performing the third line , ctr value will be lost so storinf it in temp var and reasigning in 25
			int sum=1,digit=0,total=0;
			int count=String.valueOf(ctr).length();	// to get number of digit
			for(int ctr2=1;ctr2<=count;ctr2++) 	// the for loop will run , count of digit
			{
				 digit=ctr%10;
				 sum=1;	 // after each iteration , reasinging to 1 , as we are multiplying it will start from previous value
				 for(int ctr1=1;ctr1<=digit;ctr1++)	 // this loop is for factorial 
				 {
					 sum*=ctr1;
				 }
				 total+=sum;	// adding after factorial loop
				 ctr=ctr/10;
			}
			ctr=copy;	// ctr value will be restored where it started 
			if(copy==total)
				System.out.println(total);
		}
	}
}
