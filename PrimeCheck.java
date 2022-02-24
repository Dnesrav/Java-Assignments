package exercise1;

public class PrimeCheck {
	
	public static boolean checkNumber(int num)
	{
		boolean answer = false;
		for(int ctr=2;ctr<num;ctr++)
		{
			for(int ctr1=2;ctr1<=ctr;ctr++)
			{
				if((num%ctr==0))
				{
					answer=true;
					break;
				}
				else
				{
					answer=false;
					System.out.print(ctr);
				}
			}
			//System.out.print(ctr);
		}
		
		return answer;
	}
}
