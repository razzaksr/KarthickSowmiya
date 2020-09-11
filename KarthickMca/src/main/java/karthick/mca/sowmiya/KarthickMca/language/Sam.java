package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class Sam 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int index=0;
		int[] yet= {12,45,9,7,0,1,8};
		try
		{
			System.out.println("Enter the index: ");
			index=scan.nextInt();
			System.out.println(yet[index]);
		}
		catch(ArrayIndexOutOfBoundsException ain)
		{
			System.out.println(ain+" Please enter index within: "+yet.length);
			index=scan.nextInt();
			System.out.println(yet[index]);
		}
		finally
		{
			System.out.println("Extracation done");
		}
	}
}