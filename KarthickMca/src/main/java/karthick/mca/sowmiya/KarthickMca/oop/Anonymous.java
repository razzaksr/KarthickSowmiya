package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Anonymous 
{
	public static void main(String[] args) 
	{
		FinLand fin=new FinLand();
		System.out.println(fin.position(2));
		System.out.println(Arrays.toString(fin.interval(0, 2)));
		System.out.println(Arrays.toString(new FinLand().interval(1, 3)));
		// anonymous way
		System.out.println(new FinLand().position(0));
	}
}
class FinLand
{
	private String[] names= {"Nokia","EducationINC","Vedantu","Migrant"};
	public String position(int pos)
	{
		return names[pos];
	}
	public String[] interval(int start,int end)
	{
		String[] temp=Arrays.copyOfRange(names, start, end);
		return temp;
	}
}