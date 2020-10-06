package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*
 * ArrayList/Vector:
 * add,add(index,object)
 * addAll
 * get(index)
 * remove(index),remove(object)
 * set(index,object)
 * 
 * retainAll
 * removeAll
 * 
 * Collections.sort, reverse, replaceAll
 */

public class TestList 
{
	public static void main(String[] args) 
	{
		List<Double> list1=new ArrayList<Double>();
		List<Double> list2=new Vector<Double>();
		list1.add(119.26);list1.add(89.7);list1.add(34.6);
		list1.add(67.9);list2.addAll(list1);
		System.out.println("ArrayList: "+list1);
		System.out.println("Vetor: "+list2);
		list2.add(1, 11.9);list1.remove(2);
		System.out.println(list2.contains(89.7));
		list1.set(2, 11.9);
		System.out.println("ArrayList: "+list1);
		System.out.println("Vetor: "+list2);
		list1.retainAll(list2);
		System.out.println("ArrayList: "+list1);
		list2.removeAll(list1);
		System.out.println("Vetor: "+list2);
		Collections.sort(list1);
		System.out.println("ArrayList: "+list1);
		Collections.reverse(list2);
		System.out.println("Vetor: "+list2);
		list1.add(11.9);list1.add(112.5);
		System.out.println("ArrayList: "+list1);
		Collections.replaceAll(list1, 11.9, 22.10);
		System.out.println("ArrayList: "+list1);
	}
}
