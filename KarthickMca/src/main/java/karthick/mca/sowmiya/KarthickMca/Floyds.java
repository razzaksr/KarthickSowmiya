package karthick.mca.sowmiya.KarthickMca;

// karthi

public class Floyds 
{
	public static void main(String[] hai) 
	{
		int times=0,index=0,data=0;
		for(times=0;times<hai.length;times++)
		{
			for(index=0;index<=times;index++)
			{
				System.out.print(hai[index]);
			}
			System.out.println();
		}
		for(times=hai.length-1;times>=0;times--)
		{
			for(index=0,data=0;index<hai.length;index++)
			{
				if(index>=times) {System.out.print(hai[data]);data++;}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
		for(times=0;times<hai.length;times++)//row
		{
			for(index=hai.length-1;index>times;index--)//space
			{
				System.out.print(" ");
			}
			for(data=0;data<=times;data++)//data
			{
				System.out.print(hai[data]);
			}
			System.out.println();
		}
	}
}
