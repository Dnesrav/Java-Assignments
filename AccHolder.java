package exercise1;

public class AccHolder extends Bank {
	int AccNo;
	String Holdername;
	int balance;
	final String Branch="pune";
	
	AccHolder()
	{
		//The bank is located in "+this.Branch);
	}
	
	AccHolder(int AccNo,String Holdername,	int balance,String IFSCcode, float interest)
	{
		super(IFSCcode,interest);
		this.AccNo=AccNo;
		this.Holdername=Holdername;
		this.balance=balance;
		System.out.println(this.AccNo+" "+this.Holdername +" "+this.balance+" "+this.IFSCcode+" "+this.Branch+ " "+ this.bankName);
	}
	
	void checkBranch()
	{
		System.out.println("The bank is located in "+this.Branch);
	}
}
