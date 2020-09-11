package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Contain 
{
	double[] yet= {1.2,4.5,6.8,9.1,0.3};
	public void list()
	{
		System.out.println("Array elements are: "+Arrays.toString(yet));
	}
	class Pack
	{
		public void wow(int pos)
		{System.out.println(yet[pos]);}
	}
	public static void main(String[] args) 
	{
		Contain con=new Contain();
		Pack p=con.new Pack();
		p.wow(3);
		con.list();
	}
}
