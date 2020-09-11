package karthick.mca.sowmiya.KarthickMca.oop;

public class Proof 
{
	public static void main(String[] args) 
	{
		Bank b1=new Bank();
		b1.accNo=8765456;b1.name="Karthik";b1.accBal=8080.9;
		b1.ifscCode="UTIB0070";//Bank.ifscCode="UTIB0070";
		Bank b2=new Bank();
		b2.accNo=7656787;b2.name="Sowmiya";b2.accBal=9000.4;
		System.out.println(b2.accBal);
		b2.accBal-=500;System.out.println(b2.accBal);
		System.out.println(b2.ifscCode);
	}
}
class Bank
{
	int accNo;
	String name;
	double accBal;
	static String ifscCode;
}