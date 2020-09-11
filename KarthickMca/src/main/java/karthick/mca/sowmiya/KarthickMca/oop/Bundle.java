package karthick.mca.sowmiya.KarthickMca.oop;

/*
 * Class Level members:
 * members created outside of all method and inside class, 
 * and it can be accessed through out class
 * 
 * Local members:
 * members created inside a method, 
 * which cannot be accessed by other blocks
 */

public class Bundle 
{
	double[][] hai= {{1.3,8.9},{9.1,8.2,7.1}};
	public void list()
	{
		for(double[] one:hai) 
		{
			for(double data:one) {System.out.print(data+" ");}
			System.out.println();
		}
		//System.out.println(yet);
		//since local members cannot accessed by other block
		//yet is local member of main
	}
	public void chase()
	{
		class Fun
		{
			public void auction() 
			{
				System.out.println("Inner inside method");
				System.out.println(Bundle.this.hai.length);
			}
		}

		Fun f=new Fun();f.auction();
	}
	public static void main(String[] args) 
	{
		Bundle bund=new Bundle();
		System.out.println(bund.hai.length);
		String yet="Zealous";
		bund.list();
		System.out.println("Inside Main: "+yet);
		bund.chase();
	}
}