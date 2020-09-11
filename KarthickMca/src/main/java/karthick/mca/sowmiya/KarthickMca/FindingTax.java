package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class FindingTax 
{
	public static void main(String[] args) 
	{
		short feet=0;int total=0, application=1;
		Scanner scan=new Scanner(System.in);
		while(application<=10)
		{
			System.out.println("Tell us location of land by pincode: ");
			int pin=scan.nextInt();
			System.out.println("Tell us how many square feet: ");
			short sfeet=scan.nextShort();
			if(pin>=636001&&pin<=636020)
				feet=6500;
			else if(pin>636020&&pin<=636045)
				feet=5800;
			else if(pin>636045&&pin<=636100)
				feet=3000;
			else if(pin>636100&&pin<=636200)
				feet=2000;
			else if(pin>636200)
				feet=1000;
			total=feet*sfeet;
			System.out.println("Land total purchase value: "+total);
			total+=(total*5)/100;
			System.out.println("Total amount to be paid for registration: "+total);
			application++;
		}
		scan.close();
	}
}
