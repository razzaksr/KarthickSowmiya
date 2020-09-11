package karthick.mca.sowmiya.KarthickMca.oop;

public class Tank 
{
	static int[] milages= {45,56,70,25,45,20,70,40,38};
	public void react(int in1,int in2)
	{
		while(in1<=in2)
		{
			System.out.println(milages[in1]);
			in1++;
		}
	}
	static class Massive
	{
		public void find(int delimit)
		{
			System.out.println("Finding milages > than:"+delimit);
			for(int temp:milages) 
			{if(temp>=delimit) {System.out.println(temp);}}
		}
	}
	public static void main(String[] args) 
	{
		Tank tk=new Tank();
		tk.react(2, 7);
		Tank.Massive mass=new Tank.Massive();
		mass.find(50);
		//Tank.Massive.find(50);
	}
}
