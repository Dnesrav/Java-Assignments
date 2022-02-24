package exercise1;

public class Bank {
	static String bankName;
	String IFSCcode;
	float interest;
	final String Branch="mumbai";
	static {
		bankName="SBI";
	}
	Bank()
	{
		System.out.println("");
	}
	Bank(String IFSCcode, float interest)
	{
		this.IFSCcode=IFSCcode;
		this.interest=interest;
		System.out.println("bank class "+this.IFSCcode+" "+this.interest);
	}
	void checkBranch()
	{
		System.out.println("The bank is located in "+this.Branch);
	}

}
