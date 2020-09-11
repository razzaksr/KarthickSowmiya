package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Show 
{
	public static void main(String[] args) 
	{
		int amt=0, qty=0,seats=0, sum=0;double time=13.00;
		Scanner scan=new Scanner(System.in);
		for(seats=0;seats<50&&time<=13.30;time+=0.01)
		{
			System.out.println("Tell us how many seats you want: ");
			qty=scan.nextInt();
			System.out.println("Bring the amount: ");
			amt=scan.nextInt();
			if(qty<=(50-seats)&&(amt>=(120*qty)))// logical partial
			{System.out.println("Ticket's booked");seats+=qty;}
			else {System.out.println("Can't watch the movie");}
		}
		System.out.println("Booked seats: "+seats);
		sum=seats*120;
		System.out.println("Collected amount: "+sum);
		sum-=(4*200);
		sum-=1000;
		System.out.println("Management share: "+sum);
		scan.close();
	}
}