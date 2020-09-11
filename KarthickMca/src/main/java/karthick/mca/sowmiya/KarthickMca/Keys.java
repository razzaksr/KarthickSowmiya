package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Keys 
{
	public static void main(String[] args) 
	{
		System.out.println("Trying to fill the unreserved seats");
		Scanner scan=new Scanner(System.in);int amt=0;
		for(int seat=1;seat<=15;seat++)
		{
			if(seat==1||seat==2||seat==3||seat==5||seat==7||seat%2!=0&&seat%3!=0&&seat%5!=0&&seat%7!=0)
			{System.out.println("Booked in Online");continue;}
			else 
			{
				System.out.println("Get the ticket: ");
				amt=scan.nextInt();
				if(amt>=250) {System.out.println("Seat alloted: "+seat);}
				else {System.out.println("Insufficient amount");}
			}
		}
		scan.close();
	}
}