package karthick.mca.sowmiya.KarthickMca.oop;

public class DemoCaps 
{
	public static void main(String[] args) 
	{
		Capsule cap=new Capsule();
		cap.list();
		cap.range(1, 3);
		System.out.println(cap.read(3));
	}
}
