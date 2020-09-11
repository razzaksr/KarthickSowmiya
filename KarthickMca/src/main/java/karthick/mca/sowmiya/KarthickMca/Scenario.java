package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class Scenario 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us the required RAM capacity");
		short ram=scan.nextShort();
		System.out.println("Tell us the required Internal memory capacity");
		int internal=scan.nextInt();
		System.out.println("Tell us the required Processor speed");
		float speed=scan.nextFloat();
		System.out.println("Tell us the required Battery capacity");
		short battery=scan.nextShort();
		if(ram>=2&&ram<4&&internal>=16&&internal<=32&&speed>=2.4F&&speed<2.9F||battery<=3000)
		{
			System.out.println("You will get mobiles from 8K");
		}
		else if(ram>=4&&internal>=64&&speed<2.9F||battery>=4000)
		{
			System.out.println("You will get mobiles from 12K");
			System.out.println("Tell us filter based on what customer rating:");
			float rating=scan.nextFloat();
			if(rating>=3&&rating<4)
			{
				System.out.println("Mobile prices will be 12K to 13.5K");
			}
			else if(rating>=4)
			{
				System.out.println("Mobile prices will be 14K to 25K");
			}
			else
			{
				System.out.println("No mobile found with required rating");
			}
		}
		else
		{
			System.out.println("No mobiles matched with requirement");
		}
	}
}