package karthick.mca.sowmiya.KarthickMca.language;

public class Execution 
{
	public static void main(String[] args)
	{
		Wind w=new Wind();
		Thread t1=new Thread(w,"Venkat");
		Thread t2=new Thread(w,"Vinay");
		Thread t3=new Thread(w,"Vikas");
		Thread t4=new Thread(w,"Vaibav");
		Thread t5=new Thread(w,"Vinod");
		Thread t6=new Thread(w,"Vishwa");
		Thread t7=new Thread(w,"Velan");
		t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();
		t7.start();
	}
}
class Wind extends Thread//implements Runnable
{
	@Override
	synchronized public void run()
	{
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		System.out.println("Thread Id: "+Thread.currentThread().getId());
	}
}