package exercise;
import java.util.Scanner;

public class Calendar1 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your input");
		int fromMonth = sc.nextInt();
		int daysInYear=0;
		if((fromMonth<0)||(fromMonth>12))
		{
			System.out.print("please enter input between 0 and 12, try again");
		}
		else
		{
			for(int month=fromMonth+1;(month>0&&month<=12);month++)
			{
				if(month<=7)
				{
					if((month%2)!=0)
					{
						daysInYear+=31;
					}
					else
					{
						daysInYear=(month==2)?(daysInYear+28):(daysInYear+=30);	
					}	
				}
				else
				{
					daysInYear=((month%2)!=0)?(daysInYear+30):(daysInYear+=31);
				}	
			}
			String monthName[]= {"no","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			System.out.println("the remaining no of days excluding till "+monthName[fromMonth]+" month is "+daysInYear);
		}
	}
}