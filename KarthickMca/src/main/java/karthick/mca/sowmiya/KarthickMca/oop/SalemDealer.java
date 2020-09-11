package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Scanner;

// Single inheritance

public class SalemDealer extends Coke 
{
	Scanner scan=new Scanner(System.in);
	float[] price;
	public void setCosts()
	{
		price=new float[pros.length];
		for(int ind=0;ind<pros.length;ind++)
		{
			System.out.println("\nTell us price for: "+pros[ind]);
			price[ind]=scan.nextFloat();
			System.out.println(pros[ind]+" "+price[ind]);
		}
	}
	public static void main(String[] args) 
	{
		SalemDealer salem=new SalemDealer();
		salem.listAll();
		salem.setCosts();
	}
}