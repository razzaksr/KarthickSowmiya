package karthick.mca.sowmiya.KarthickMca.oop;

public class Runtime extends Coke
{
	int[] qty= {100,250,890,200};
	public void listAll()
	{
		System.out.println("Runtime listAll");
		for(int index=0;index<pros.length;index++)
		{
			System.out.println(pros[index]+" "+qty[index]);
		}
		super.listAll();
	}
	public static void main(String[] args) 
	{
		Runtime run=new Runtime();
		run.listAll();
	}
}
