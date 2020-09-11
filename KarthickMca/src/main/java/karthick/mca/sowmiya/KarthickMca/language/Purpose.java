package karthick.mca.sowmiya.KarthickMca.language;

public class Purpose 
{
	public static void main(String[] args) 
	{
		Finale fin=new Finale();
		Thread t1=new Thread(fin,"Karthick");
		Thread t2=new Thread(fin,"Sowmiya");
		Thread t3=new Thread(fin,"Venkat");
		Thread t4=new Thread(fin,"Richard");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Finale extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("Full stack java developer should learn following:"
		+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("HTML5, Bootstrap and Angular"
			+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("Spring Boot"+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("Hibernate"+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("JUnit"+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("Git"+Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("Maven and Jenkins"+Thread.currentThread().getName());
		}
		catch(InterruptedException in)
		{
			System.out.println(in);
		}
	}
}