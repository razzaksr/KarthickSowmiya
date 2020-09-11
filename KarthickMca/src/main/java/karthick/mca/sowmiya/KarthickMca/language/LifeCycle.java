package karthick.mca.sowmiya.KarthickMca.language;

import java.util.Scanner;

public class LifeCycle 
{
	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		Thread t1=new Thread(f,"Ravi");
		Thread t2=new Thread(f,"Raj");
		Thread t3=new Thread(f,"Rana");
		Thread t4=new Thread(f,"Raman");
		Thread t5=new Thread(f,"Ratha");
		t1.start();t5.start();t2.start();t3.start();t4.start();
	}
}
class Factorial implements Runnable 
{
	Scanner scan=new Scanner(System.in);
	int num;
	@Override
	public void run() 
	{
		synchronized (scan)
		{
			int fact=1;
			System.out.println("Tell us number to find factorial: "+
		Thread.currentThread().getName());
			num=scan.nextInt();//5*4*3*2*1
			if(Thread.currentThread().getName().equals("Ratha"))
			{
				System.out.println("Has to wait 10s to know the output");
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(Thread.currentThread().getName().equals("Ravi"))
			{
				System.out.println(" Ravi Going to suspend");
				Thread.currentThread().stop();
			}
			for(int n=num;n>=1;n--)
			{
				fact*=n;
			}
			System.out.println(Thread.currentThread().getName()
					+" factorial "+fact+" for "+num);
		}
	}
}