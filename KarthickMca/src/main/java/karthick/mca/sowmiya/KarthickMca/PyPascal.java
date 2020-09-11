package karthick.mca.sowmiya.KarthickMca;

public class PyPascal 
{
	public static void main(String[] hai) 
	{
		int times=0,index=0,data=0,limit=1;
		for(times=hai.length-1;times>=0;times--)
		{
			for(index=0,data=0;index<hai.length;index++)
			{
				if(index>=times) {System.out.print(hai[data]+" ");data++;}
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
				System.out.print(hai[data]+" ");
			}
			System.out.println();
		}
		if(hai.length%2!=0)
		{
			for(times=1;times<=(hai.length/2+1);times++)//row
			{
				//System.out.println(times);
				for(index=(hai.length/2);index>=times;index--)//space
				{
					System.out.print(" ");
				}
				for(data=0;data<limit;data++)//data
				{
					System.out.print(hai[data]+"");
				}
				limit+=2;System.out.println();
			}
		}
		else {System.out.println("can't draw pyramid");}
	}
}
