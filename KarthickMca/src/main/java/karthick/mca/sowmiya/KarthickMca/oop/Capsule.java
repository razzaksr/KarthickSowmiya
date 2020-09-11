package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Capsule 
{
	private int[] yet= {12,45,89,110,88};
	public void list() {System.out.println(Arrays.toString(yet));}
	int read(int index) {return yet[index];}
	protected void range(int start,int end)
	{System.out.println(Arrays.toString(Arrays.copyOfRange(yet, start, end)));}
}
