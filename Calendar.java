package exercise;
import java.util.Scanner;

public class Calendar {
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
					switch(month%2)
					{
					case 1:
						daysInYear+=31;
						break;
					case 0:
						daysInYear=(month==2)?(daysInYear+28):(daysInYear+=30);	
						break;
					}
					
				}
				else
				{
					switch(month%2)
					{
					case 1:
						daysInYear+=30;
						break;
					case 0:
						daysInYear=daysInYear+=31;
						break;
					}
				}	
			}
			String monthName[]= {"no","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			System.out.println("the remaining no of days excluding till "+monthName[fromMonth]+" month is "+daysInYear);
		}
	}
}
