package karthick.mca.sowmiya.KarthickMca.array;

public class Sorting 
{
	public static void main(String[] args) 
	{
		String temp="";
		String[] danger= {"Madhurai","Chengalpattu","Veeloor","Chennai","Villupuram","Kadaloor"};
		for(int pos=0;pos<danger.length;pos++)
		{
			for(int com=pos+1;com<danger.length;com++)
			{
				if(danger[pos].compareTo(danger[com])>0)
				{
					temp=danger[pos];danger[pos]=danger[com];danger[com]=temp;
				}
			}
		}
		for(String t:danger) {System.out.println(t);}
	}
}