package karthick.mca.sowmiya.KarthickMca;

public class Modis extends Mess //extends Finance
{
	/*public void geek()
	{
		System.out.println("Java is king of kings");
		super.geek();
	}*/
	public static void main(String[] args) 
	{
		Finance fin=new Finance();fin.hello();
		Modis mod=new Modis();mod.geek();
		//mod.hello();
	}
}
final class Finance
{
	public void hello()
	{
		System.out.println("Greetings from Zealous");
	}
}
class Mess
{
	final public void geek()
	{
		System.out.println("Zealous is a geek of technology");
	}
}