package karthick.mca.sowmiya.KarthickMca.array;

public class Retailer 
{
	public static void transpose(int[][] src,int[][] dest)
	{
		for(int row=0;row<dest.length;row++)
		{
			for(int col=0;col<dest[row].length;col++)
			{
				dest[row][col]=src[col][row];
			}
		}
	}
	public static void list(int[][] cat)
	{
		for(int[] row:cat)
		{
			for(int col:row){System.out.print(col+" ");}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[][] drives= {{980,700,620,300},{1200,950,700,450},{700,600,300,200}};
		int[][] wish=new int[4][3];
		Retailer.transpose(drives, wish);
		Retailer.list(drives);
		Retailer.list(wish);
		/*System.out.println(drives.length);
		System.out.println(drives[0].length);
		for(int row=0;row<drives.length;row++)
		{
			for(int col=0;col<drives[row].length;col++)
			{
				System.out.print(drives[row][col]+" ");
			}
			System.out.println();
		}*/
	}
}