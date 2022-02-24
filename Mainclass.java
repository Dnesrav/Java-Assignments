package exercise1;

public class Mainclass {
	public static void main(String args[])
	{
		Bank bank=new Bank();
		bank.checkBranch();
		
		AccHolder acc=new AccHolder(12345,"edubridge",0,"SBIN0000324", 9.6f);
		
		Bank b1=new AccHolder();
		b1.checkBranch();
	}

}
