import java.util.Scanner;

public class ShivamPattern 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		for(int ctr=1;ctr<num;ctr++) 
		{
			if(ctr!=num-1)
			{
				System.out.print("* ");
				for(int ctr2=1;ctr2<ctr;ctr2++)
				{
					System.out.print("^ ");
					if(ctr-ctr2==1)
						System.out.print("* ");
				}
			}
			else
			{
				for(int ctr1=1;ctr1<=num;ctr1++)
				{
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
	}
}

