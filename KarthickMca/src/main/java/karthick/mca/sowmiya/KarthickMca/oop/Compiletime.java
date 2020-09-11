package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Compiletime 
{
	String[][] stock= {{"Wipro","JSW","Vedanta"},{"Reliance","HP"},
			{"Jio","Accenture","Hp","Amazon","Cognizant"}};
	public void search(int row)
	{
		if(row<stock.length)
		{System.out.println(Arrays.toString(stock[row]));}
		else {System.out.println("Invalid selection");}
	}
	public void search(int row,int col)
	{
		if(row<stock.length)
		{
			if(col<stock[row].length)
			{System.out.println(stock[row][col]);}
		}
	}
	public void search(String name)
	{
		for(int row=0;row<stock.length;row++)
		{
			for(int col=0;col<stock[row].length;col++)
			{
				if(stock[row][col].equals(name)) 
				{System.out.println(name+" Matched @ "+row+" "+col);}
			}
		}
	}
	public static void main(String[] args) 
	{
		Compiletime compile=new Compiletime();
		compile.search(1);
		compile.search("Jio");
		compile.search(2, 3);
	}
}