package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class Redirect 
{
	public static void main(String[] args) 
	{
		try
		{
			Check.react(10);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai+"\nInside main");
			System.out.println("index value should be less than: "+Check.hai.length);
			Scanner scan=new Scanner(System.in);
			System.out.println(Check.hai[scan.nextInt()]);
		}
	}
}
class Check
{
	static String[] hai= {"Downey","Evans","Helmsworth","Scarlet","Hiddleson"};
	public static void react(int index)
	{
		try
		{
			System.out.println(hai[index]);
		}
		catch(ArrayIndexOutOfBoundsException ain)
		{
			System.out.println(ain+"\ninside Check class");
			throw ain;
		}
	}
}