package karthick.mca.sowmiya.KarthickMca;

public class SimplePattern 
{
	public static void main(String[] args) 
	{
		for(int row=1,num=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++,num+=2)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for(int row=1,num=97;row<=5;row++)
		{
			for(int col=1;col<=5;col++,num++)
			{
				System.out.print((char)num+" ");
			}
			System.out.println();
		}
	}
}
