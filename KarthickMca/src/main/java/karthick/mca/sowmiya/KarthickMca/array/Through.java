package karthick.mca.sowmiya.KarthickMca.array;

public class Through 
{
	public static void check(String[] hai)
	{
		String temp="";
		for(int index=0;index<hai.length;index++)
		{
			for(int pos=index+1;pos<hai.length;pos++)
			{
				if(hai[index].endsWith("a")||hai[index].endsWith("e")||
				hai[index].endsWith("i")||hai[index].endsWith("o")||
				hai[index].endsWith("u"))
				{
					if(!(hai[pos].endsWith("a")||hai[pos].endsWith("e")
					||hai[pos].endsWith("i")||hai[pos].endsWith("o")||
					hai[pos].endsWith("u")))
					{
						temp=hai[index];hai[index]=hai[pos];hai[pos]=temp;
					}
				}
			}
		}
	}
	public static void list(String[]  hai)
	{
		for(String h:hai)
		{System.out.println(h);}
	}
	public static void main(String[] args) 
	{
		String[] danger= {"Madhurai","Chengalpattu","Veeloor","Chennai","Villupuram","Kadaloor"};
		Through.check(danger);
		Through.list(danger);
	}
}
