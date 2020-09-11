package karthick.mca.sowmiya.KarthickMca;

public class FloydsReverse 
{
	public static void main(String[] hai) 
	{
		int times=0,index=0,data=0;
		for(times=hai.length-1;times>=0;times--)
		{
			for(index=0;index<=times;index++)
			{
				System.out.print(hai[index]);
			}
			System.out.println();
		}
		for(times=hai.length-1;times>=0;times--)
		{
			for(index=hai.length-1,data=0;index>=0;index--)
			{
				if(index<=times) {System.out.print(hai[data]);data++;}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
	}
}