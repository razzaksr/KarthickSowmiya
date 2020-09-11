package karthick.mca.sowmiya.KarthickMca.language;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primary 
{
	public static void main(String[] args) 
	{
		int data1=0,data2=0;
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter the value of data1");
			data1=scan.nextInt();
			System.out.println("Enter the value of data2");
			data2=scan.nextInt();
			System.out.println(data1+data2);
		}
		catch(InputMismatchException ins)
		{
			//System.out.println(ins);
			ins.printStackTrace();
			System.out.println("Please enter only numbers");
			Scanner get=new Scanner(System.in);
			System.out.println("Enter the value of data1");
			data1=get.nextInt();
			System.out.println("Enter the value of data2");
			data2=get.nextInt();
			System.out.println(data1+data2);
		}
		finally
		{
			System.out.println("End of program");
		}
	}
}