package karthick.mca.sowmiya.KarthickMca.array;

public class Simple 
{
	public static void main(String[] args) 
	{
		int[] exp= {2,9,12,2,1,0,11,1,8,1};
		System.out.println(exp.length);
		for(int ind=3;ind<exp.length-2;ind++)
		{
			System.out.println(exp[ind]);
		}
		//for(datatype tempVar:base){tempVar}
		for(int yet:exp)//forEach
		{
			System.out.println(yet);
		}
	}
}
