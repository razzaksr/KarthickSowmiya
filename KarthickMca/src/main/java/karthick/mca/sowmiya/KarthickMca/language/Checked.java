package karthick.mca.sowmiya.KarthickMca.language;

import java.io.IOException;

public class Checked 
{
	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		Fibonacci.gen(10);
	}
}

class Fibonacci
{
	static int data1=0,data2=1;
	public static void gen(int limit)throws ClassNotFoundException, IOException, NullPointerException
	{
		System.out.println(data1+"\n"+data2);
		for(int times=2;times<limit;times++)
		{
			int sum=data1+data2;
			data1=data2;data2=sum;
			System.out.println(data2);
		}
	}
}