package karthick.mca.sowmiya.KarthickMca.array;

public class Bubble 
{
	public static void main(String[] args) 
	{
		double[] prices= {17.17,120.8,1200.8,10.9,3.4,20.6,4.5,12.7,45.9,89.3,72.4,38.5};
		for(int times=0;times<prices.length-1;times++)
		{
			for(int bub=0;bub<prices.length-times-1;bub++)
			{
				if(prices[bub]>prices[bub+1])
				{
					prices[bub]*=prices[bub+1];
					prices[bub+1]=prices[bub]/prices[bub+1];
					prices[bub]/=prices[bub+1];
				}
			}
		}
		for(double temp:prices) {System.out.println(temp);}
	}
}
