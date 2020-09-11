package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class Each 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Quiz q=new Quiz();
		Thread t1=new Thread(q,"Alpha");
		Thread t2=new Thread(q,"Beta");
		Thread t3=new Thread(q,"Cosmo");
		Thread t4=new Thread(q,"Delta");
		t1.start();t1.join();t2.start();t2.join();t3.start();t3.join();
		t4.start();
	}
}
class Quiz implements Runnable
{
	Scanner scan=new Scanner(System.in);
	String ques; boolean ans;int point;
	@Override
	public void run()
	{
		point=0;
		System.out.println("Organizer will ask questions to "+
		Thread.currentThread().getName());
		for(int q=1;q<=4;q++)
		{
			System.out.println("Question is: ");
			ques=scan.next();
			System.out.println(Thread.currentThread().getName()
					+" will answer");
			ans=scan.nextBoolean();
			if(ans==true) {point++;}
		}
		System.out.println(Thread.currentThread().getName()+" got "+point);
	}
}