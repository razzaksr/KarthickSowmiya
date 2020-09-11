package karthick.mca.sowmiya.KarthickMca.oop;

public class DemoAbs extends Fence
{
	public static void main(String[] args) 
	{
		Hai h=new Hai();h.geek();
		Fence f=new DemoAbs();f.look();
	}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.println("Overriden from abstract fence");
	}
}
abstract class Fence
{
	public void seek()
	{
		System.out.println("Fence class non abstract");
	}
	abstract public void look();// abstract method
}
class Hai
{
	public void geek()
	{
		System.out.println("Non abstract method");
	}
}
interface Hello
{
	public void freak();// abstract methods
}