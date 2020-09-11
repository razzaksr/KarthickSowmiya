package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Game g=new Game();
		Shopping shop=new Shopping(g);
		Thread t1=new Thread(g,"Kartchik");
		Thread t2=new Thread(shop,"Vinod");
		t1.start();t2.start();
	}
}
class Game implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int entry;
	@Override
	public void run() 
	{
		synchronized (scan) 
		{
			System.out.println("Welcome "+Thread.currentThread().getName());
			System.out.println("Please enter the entry fee: ");
			entry=scan.nextInt();
			if(entry<500)
			{
				System.out.println("You dont have sufficient amount arrange requuired amount");
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("All water games are available for you");
		}
	}	
}
class Shopping implements Runnable
{
	Game gme;
	public Shopping() {}
	public Shopping(Game game) 
	{
		gme=game;
	}
	@Override
	public void run() 
	{
		synchronized (gme.scan) 
		{
			if(gme.entry<500) {
				System.out.println(Thread.currentThread().getName()
						+" going give the required amount");
				gme.scan.notify();
			}
		}
		System.out.println(Thread.currentThread().getName()
				+" Entered into DMart for shopping");
		System.out.println(Thread.currentThread().getName()
				+" Gonna buy the Travel bag");
	}
}