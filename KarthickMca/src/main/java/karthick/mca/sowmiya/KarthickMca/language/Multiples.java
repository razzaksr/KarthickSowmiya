package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Random;
import java.util.Scanner;

public class Multiples 
{
	public static void main(String[] args) 
	{
		Wisdom wis=new Wisdom();
		Wealth wel=new Wealth();
		Thread t1=new Thread(wel,"Ryan");
		Thread t2=new Thread(wis,"Revanth");
		Thread t3=new Thread(wel,"Rathesh");
		Thread t4=new Thread(wis,"Raashi");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Wisdom implements Runnable
{
	@Override
	public void run() 
	{
		String temp="0123456789", otp="";
		Random ran=new Random();
		System.out.println("Academic Department");
		System.out.println(Thread.currentThread().getName()+" has enetered");
			for(int digit=1;digit<=4;digit++)
			{
				otp+=ran.nextInt(temp.length());
			}
			System.out.println(Thread.currentThread().getName()+" OTP is: "+otp);
	}	
}
class Wealth implements Runnable
{
	Scanner scan=new Scanner(System.in);
	String skill;
	@Override
	synchronized public void run() 
	{
		System.out.println("Placement Department");
		System.out.println(Thread.currentThread().getName()
				+" Please mention your interest");
		skill=scan.next();
		if(skill.equalsIgnoreCase("java"))
		{System.out.println(Thread.currentThread().getName()
				+" Batch A timing 12 to 2");}
		else if(skill.equalsIgnoreCase("python"))
		{System.out.println(Thread.currentThread().getName()
				+" Batch D timing 3 to 5");}
		else if(skill.equalsIgnoreCase("javascript"))
		{System.out.println(Thread.currentThread().getName()
				+" Batch B timing 10 to 12");}
		else if(skill.equalsIgnoreCase("php"))
		{System.out.println(Thread.currentThread().getName()
				+" Batch C timing 1 to 3");}
		else {System.out.println(Thread.currentThread().getName()
				+" Can't make batch please find support from outside");}
	}
}