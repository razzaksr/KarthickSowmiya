package karthick.mca.sowmiya.KarthickMca;

public class Tables 
{
	public static void main(String[] args) 
	{
		for(int take=1;take<=10;take++)
		{
			System.out.println("Table of: "+take);
			for(int away=1;away<=10;away++)
			{
				System.out.println(take+"X"+away+"="+(take*away));
			}
		}
	}
}