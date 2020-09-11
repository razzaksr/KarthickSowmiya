package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class DemoCustom 
{
	static String[] hai= {"Downey","Evans","Helmsworth","Scarlet","Hiddleson"};
	static Scanner scan=new Scanner(System.in);
	public static int check(String phrase)
	{
		int count=0;
		for(int index=0;index<hai.length;index++)
		{
			if(hai[index].startsWith(phrase))
			{count++;System.out.println(hai[index]);}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the phrase to check");
		try
		{
			if(DemoCustom.check(scan.next())==0)
			{
				throw new SowmiyaException();
			}
		}
		catch(SowmiyaException sow)
		{
			System.out.println(sow);
			DemoCustom.check(scan.next());
		}
	}
}
