package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Decide 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us your salary: ");
		double ctc=scan.nextDouble();
		if(ctc>=2.5&&ctc<=5)
		{
			System.out.println("5% tax need to pay "+(ctc*5)/100);
		}
		else if(ctc>5&&ctc<=10)
		{
			System.out.println("10% tax need to pay "+(ctc*10)/100);
		}
		else if(ctc>10&&ctc<=15)
		{
			System.out.println("15% tax need to pay "+(ctc*15)/100);
		}
		else if(ctc>15&&ctc<=25)
		{
			System.out.println("20% tax need to pay "+(ctc*20)/100);
		}
		else if(ctc>25)
		{
			System.out.println("30% tax need to pay "+(ctc*30)/100);
		}
		else
		{
			System.out.println("You no need to pay tax");
		}
	}
}
