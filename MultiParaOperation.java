package Exercise2;
import java.util.Scanner;
public class MultiParaOperation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int select;
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("1.Addition ");
			System.out.println("2.subtraction ");
			System.out.println("3.Multiplication ");
			System.out.println("4.Division - only two number is accepted ");
			System.out.println("5.square root ");
			System.out.println("6.cube root ");
			System.out.println("7.Maximum of two number ");
			System.out.println("8.Minimum of two number ");
			System.out.println("9.power of x ");
			System.out.println("10.Exit ");
			System.out.println("Enter your choice of operation  ");
			System.out.println("--------------------------------------------------");		
		    select=scan.nextInt();
			int value=0,mvalue=1;
			switch(select) {
			
			case 1:
				System.out.println("enter number of input for +");
				int size=scan.nextInt();
				int arr[]=new int[size];
				for(int ctr=0;ctr<size;ctr++)
				{
					arr[ctr]=scan.nextInt();
				}
				for(int ctr=0;ctr<size;ctr++)
				{
					value+=arr[ctr];
				}
				System.out.println("The addition of numbers is "+ value);	
				break;
			case 2:
				System.out.println("enter number of input for -  ");
				int size1=scan.nextInt();
				int arr1[]=new int[size1];
				for(int ctr=0;ctr<size1;ctr++)
				{
					arr1[ctr]=scan.nextInt();
				}
				for(int ctr=0;ctr<size1;ctr++)
				{
					value=(value<arr1[ctr])?arr1[ctr]-value:value-arr1[ctr];
				}
				System.out.println("The subtraction of number is "+ value);
				break;
			case 3:
				System.out.println("enter number of input for *  ");
				int size2=scan.nextInt();
				int arr2[]=new int[size2];
				for(int ctr=0;ctr<size2;ctr++)
				{
					arr2[ctr]=scan.nextInt();
				}
				for(int ctr=0;ctr<size2;ctr++)
				{
					mvalue*=arr2[ctr];
				}
				System.out.println("The Multiplication of number is "+ mvalue);
				break;
			case 4:
				System.out.println("Enter the first number  ");
				int num1=scan.nextInt();
				System.out.println("Enter the second number  ");
				int num2=scan.nextInt();
				System.out.println("The Division of "+num1+" and "+num2+" is "+(double)num1/num2);
				break;
			case 5:
				System.out.println("Enter the number to find square root ");
				int num3=scan.nextInt();
				System.out.println(Math.sqrt(num3));
				break;
			case 6:
				System.out.println("Enter the number to find cube root ");
				int num4=scan.nextInt();
				System.out.println(Math.cbrt(num4));
				break;
			case 7:
				System.out.println("Enter two number to maximum ");
				int num5=scan.nextInt();
				System.out.println("Enter the second number  ");
				int num6=scan.nextInt();
				System.out.println(Math.max(num5,num6));
				break;
			case 8:
				System.out.println("Enter two number to minimum ");
				int num7=scan.nextInt();
				System.out.println("Enter the second number  ");
				int num8=scan.nextInt();
				System.out.println(Math.min(num7,num8));
				break;
			case 9:
				System.out.println("Enter two number to power of x ");
				int num9=scan.nextInt();
				System.out.println("Enter the power  ");
				int num10=scan.nextInt();
				System.out.println(Math.min(num9,num10));
				break;
			case 10:
				System.exit(0);
			default:
				System.out.println("enter option between 1-10");
			
			}
		}while(select!=10);
	}
}




			