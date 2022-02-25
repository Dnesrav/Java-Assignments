import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");//382
		int num = scan.nextInt();
		int digit=0;
		int sum=0;
		int product=1;
		while(num>0)//382,38>0,3>0
		{
			digit=num%10;//2,8,3
			sum+=digit;//2+8+3
			product*=digit;//2*8*3
			num=num/10; //38,3,0	
		}
		if(sum==product)
			System.out.print("SPy number");
		else
			System.out.print("not SPy number");
	}

}
