package karthick.mca.sowmiya.KarthickMca.array;

public class MultidimensionSort 
{
	public static void list(Integer[][] hai)
	{
		for(int row=0;row<hai.length;row++)
		{
			for(int col=0;col<hai[row].length;col++)
			{
				System.out.print(hai[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void sort(Integer[][] hai)
	{
		for(int row=0;row<hai.length;row++)
		{
			for(int hold=0;hold<hai[row].length;hold++)
			{
				for(int com=hold+1;com<hai[row].length;com++)
				{
					if(hai[row][hold]>hai[row][com])
					{
						hai[row][hold]+=hai[row][com];
						hai[row][com]=hai[row][hold]-hai[row][com];
						hai[row][hold]-=hai[row][com];
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Integer[][] pros= {{12,89,45},{19,20,11},{11,78,22}};
		MultidimensionSort.list(pros);
		MultidimensionSort.sort(pros);
		MultidimensionSort.list(pros);
	}
}
