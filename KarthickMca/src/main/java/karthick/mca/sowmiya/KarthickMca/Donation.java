package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Donation 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int sum=0,each=0,collected=0;
		for(int sec=1;sec<=3;sec++)
		{
			System.out.println(sec+" Section starts to collect fund");sum=0;
			for(int per=1;per<=5;per++)
			{
				System.out.println("tell us how much you gonna donate: ");
				each=scan.nextInt();
				sum+=each;
			}
			System.out.println("Amount collected by "+sec+" is: "+sum);
			collected+=sum;
		}
		System.out.println("Covid 19 relief fund is: "+collected);
		scan.close();
	}
}
