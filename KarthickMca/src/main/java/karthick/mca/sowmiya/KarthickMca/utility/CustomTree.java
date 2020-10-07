package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.TreeSet;

import karthick.mca.sowmiya.KarthickMca.oop.Bus;

public class CustomTree 
{
	public static void main(String[] args) 
	{
		TreeSet<Bus> trav=new TreeSet<Bus>();
		trav.add(new Bus("Orange", "Salem", "Chennai", "AC", "GPS", 25, 500,9876555L));
		trav.add(new Bus("Kallada", "Salem", "Chennai", "SL", "GPS", 20, 1000,5678765676L));
		trav.add(new Bus("Parveen", "Mumbai", "Chennai", "UD", "GPS", 10, 1900,7654567L));
		trav.add(new Bus("National", "Salem", "Chennai", "AC", "GPS", 20, 1000,6456789L));
		for(Bus temp:trav)
		{
			System.out.println(temp);
		}
	}
}
