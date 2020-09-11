package karthick.mca.sowmiya.KarthickMca.array;

public class Dimensionals 
{
	public static void duo(Double[][] alpha,Integer[][] beta)
	{
		for(int row=0;row<beta.length;row++)
		{
			beta[row]=new Integer[alpha[row].length];
			for(int col=0;col<beta[row].length;col++)
			{
				beta[row][col]=(int)(double)alpha[row][col];
			}
		}
	}
	public static void list(Object[][] hai)
	{
		for(Object[] row:hai)
		{
			for(Object data:row)
			{System.out.print(data+" ");}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Double[][] sensation= {{1.2,8.2,1.9,2.3,7.9},{2.2,5.6,8.2},{12.9,5.0,3.4,1.1}};
		Integer[][] converted=new Integer[sensation.length][];
		Dimensionals.list(sensation);
		Dimensionals.duo(sensation, converted);
		Dimensionals.list(converted);
	}
}
