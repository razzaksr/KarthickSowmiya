package karthick.mca.sowmiya.KarthickMca.oop;

// Hierarchy

public class Retailer //extends SalemRetail, NamakkalRetail
{
	public static void main(String[] args) 
	{
		SalemRetail salem=new SalemRetail();
		NamakkalRetail namakkal=new NamakkalRetail();
		salem.setCosts();salem.discount();
		namakkal.setCosts();namakkal.offer();
	}
}
class SalemRetail extends SalemDealer
{
	public void discount()
	{
		for(int ind=0;ind<pros.length;ind++)
		{
			if(pros[ind]=="Cokacola"||pros[ind]=="Mountendew")
			{
				price[ind]-=(price[ind]*10)/100;
			}
			System.out.println(pros[ind]+"  "+price[ind]);
		}
	}
}
class NamakkalRetail extends SalemDealer
{
	public void offer()
	{
		for(int ind=0;ind<pros.length;ind++)
		{
			if(price[ind]>=30)
			{
			System.out.println(pros[ind]+" you can get another one free");
			}
			System.out.println(pros[ind]+"  "+price[ind]);
		}
	}
}