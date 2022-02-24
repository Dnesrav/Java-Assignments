import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the string");
		String str=scan.nextLine();
        StringTokenizer str1=new StringTokenizer(str," ");//hi helo 
        while(str1.hasMoreTokens())
        {
        	StringBuffer str2= new StringBuffer(str1.nextToken());
        	System.out.print(str2.reverse()+" ");
        }
	}
}
