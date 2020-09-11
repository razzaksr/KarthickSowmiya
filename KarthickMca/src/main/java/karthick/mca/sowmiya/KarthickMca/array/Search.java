package karthick.mca.sowmiya.KarthickMca.array;

import java.util.Scanner;

public class Search 
{
	public static void main(String[] args) 
	{
		double[] prices= {17.17,120.8,1200.8,10.9,3.4,20.6,4.5,12.7,45.9,89.3,72.4,38.5};
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us min and max ranges: ");
		double start=scan.nextDouble();
		double end=scan.nextDouble();
		// matching land values
		System.out.println("Available land values between "+start+" and "+end);
		for(int index=0;index<prices.length;index++)
		{
			if(prices[index]>=start&&prices[index]<=end)
			{System.out.println(prices[index]+" @ "+(index+1));}
		}
		scan.close();
	}
}