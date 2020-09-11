package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class Many
{
	public static void main(String[] args) 
	{
		String alpha=null;int index=0;
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter the index to fetch: ");
			index=scan.nextInt();
			System.out.println(alpha.charAt(index));
		}
		catch(NullPointerException nu)
		{
			try
			{
				System.out.println(nu+" first allocate value for alpha: ");
				alpha=scan.next();
				System.out.println("Enter the index to fetch: ");
				index=scan.nextInt();
				System.out.println(alpha.charAt(index));
			}
			catch(StringIndexOutOfBoundsException sin)
			{
				System.out.println(sin+"\nIndex within: "+alpha.length());
				index=scan.nextInt();
				System.out.println(alpha.charAt(index));
			}
		}
	}
}
