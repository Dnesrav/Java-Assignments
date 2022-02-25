import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		//System.out.println("enter the number");
		//int num = scan.nextInt();
		
		int digit;
		for(int num=1;num<10000;num++)
		{
			int sum=0;
			int squar = num*num;
			for(;squar>0;) {
				digit = squar%10;
				sum = sum+digit;
				squar=squar/10;
			}
			if(num==sum)
				System.out.println(num);
		}
	}
}
