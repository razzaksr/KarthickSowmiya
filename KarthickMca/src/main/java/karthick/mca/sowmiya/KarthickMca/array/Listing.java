package karthick.mca.sowmiya.KarthickMca.array;

public class Listing 
{
	public static void main(String[] args) 
	{
		String[] coach=new String[10];
		coach[0]="Mohamed";coach[6]="Sabari";
		coach[8]="Victor";coach[3]="Ravi";
		for(String temp:coach) {System.out.println(temp);}
		// unreserved seats
		for(int index=0;index<coach.length;index++)
		{
			if(coach[index]!=null) 
			{System.out.println("Reserved seat: "+index);}
			else {System.out.println("Unreserved seat: "+index);}
		}
	}
}