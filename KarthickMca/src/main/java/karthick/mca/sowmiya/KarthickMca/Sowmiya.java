package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Sowmiya 
{
	public static void main(String[] args) 
	{
		System.out.println("Sample Maven Project");
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us your price: ");
		double price=scan.nextDouble();
		System.out.println("Whether your mobile eligible to insure: "+(price>=8000));
		System.out.println("Whether your mobile eligible for emi: "+(price>=10000));
	}
}
