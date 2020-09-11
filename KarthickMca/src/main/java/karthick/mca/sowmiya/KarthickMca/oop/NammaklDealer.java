package karthick.mca.sowmiya.KarthickMca.oop;

// Multilevel

public class NammaklDealer extends SalemDealer 
{
	public void addTax()
	{
		for(int ind=0;ind<price.length;ind++)
		{
			price[ind]+=(price[ind]*6)/100;
			System.out.println(pros[ind]+" "+price[ind]);
		}
	}
	public static void main(String[] args) 
	{
		NammaklDealer deal=new NammaklDealer();
		deal.setCosts();
		deal.addTax();
	}
}