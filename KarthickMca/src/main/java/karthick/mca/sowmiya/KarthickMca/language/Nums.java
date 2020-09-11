package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

// type parsing: parseInt,parseFloat,parseDouble

public class Nums 
{
	public static void main(String[] args) 
	{
		String accept="";Long contact=0L;
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Enter contact number: ");
			accept=scan.next();
			contact=Long.parseLong(accept);
			if(accept.startsWith("0")&&accept.length()>=10)
			{
				System.out.println(contact+" Entered one is landline");
			}
			else if(accept.length()==10)
			{
				System.out.println(contact+" Entered one is mobile");
			}
		}
		catch(NumberFormatException num)
		{
			System.out.println(num+"\nEnter only numeric: ");
			accept=scan.next();
			contact=Long.parseLong(accept);
			if(accept.startsWith("0")&&accept.length()>=10)
			{
				System.out.println(contact+" Entered one is landline");
			}
			else if(accept.length()==10)
			{
				System.out.println(contact+" Entered one is mobile");
			}
		}
	}
}
