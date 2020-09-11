package karthick.mca.sowmiya.KarthickMca.array;

import java.util.Scanner;

public class Creation 
{
	public static void main(String[] args) 
	{
		String[] inbox=new String[20];int much=0;boolean state=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Total capacity to store: "+inbox.length);
		//receiving sms
		// inserting elements in array
		do
		{
			System.out.println("Tell us sender: ");
			inbox[much]=scan.next();
			much++;
			System.out.println("Do you wish to receive more: ");
			state=scan.nextBoolean();
		}while(state==true&&much<inbox.length);
		System.out.println("No of sms is: "+much);
		scan.close();
	}
}
