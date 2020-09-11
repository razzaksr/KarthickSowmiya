package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class CustomBlock 
{
	public static void main(String[] args) 
	{
		Counter count=new Counter();
		Thread t1=new Thread(count,"Abi");
		Thread t2=new Thread(count,"Aravind");
		Thread t3=new Thread(count,"Arun");
		Thread t4=new Thread(count,"Arav");
		Thread t5=new Thread(count,"Anand");
		t1.start();t2.start();t3.start();t4.start();t5.start();
	}
}
class Counter implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int ticket;
	@Override
	public void run() 
	{
		System.out.println("Welcome to Sathyam Cinams "+
	Thread.currentThread().getName());
		synchronized (scan)// thread safety 
		{
			System.out.println("Enter the amount: "+
		Thread.currentThread().getName());
			ticket=scan.nextInt();
			if(ticket>=200) 
			{
				System.out.println(Thread.currentThread().getName()
						+" got ticket");
			}
			else 
			{
				System.out.println(Thread.currentThread().getName()
						+" wont get the ticket");
			}
		}
		System.out.println("Ticket price is 200 "
		+Thread.currentThread().getName());
		System.out.println("Enjoy rich movie experience "
		+Thread.currentThread().getName());
	}
}