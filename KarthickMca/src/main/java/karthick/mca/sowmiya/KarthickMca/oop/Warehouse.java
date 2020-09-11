package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Warehouse 
{
	static int position;// class member
	String name;
	public static void main(String[] args) 
	{
		Warehouse ware=new Warehouse();
		ware.position=19;// position=19// Warehouse.position=19
		ware.name="Prakash";
		System.out.println(ware.position);
		//System.out.println(position);
		//System.out.println(Warehouse.position);
		System.out.println(ware.name);
		Warehouse w2=new Warehouse();
		w2.name="Victor";
		System.out.println(w2.name);System.out.println(Warehouse.position);
		w2.position=10;
		//position=10;
		//Warehouse.position=10;
		System.out.println("Ware position: "+ware.position);
		//System.out.println("Ware position: "+position);
		//System.out.println(Warehouse.position);
		Further fur=new Further();
		System.out.println(Arrays.toString(fur.simple));
	}
}
class Further
{
	int[] simple= {12,45,67,89,12,3,1,5};
}