package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set:
 * add, addAll
 * Contains
 * remove(object)
 * 
 * 
 */

public class TestSet 
{
	public static void main(String[] args) 
	{
		HashSet<Character> set1=new HashSet<Character>();
		set1.add('E');set1.add('I');set1.add('A');set1.add('U');
		set1.add('V');set1.add('A');
		System.out.println(set1);
		TreeSet<Character> set2=new TreeSet<Character>();
		set2.addAll(set1);
		System.out.println(set2);
		set2.remove('I');
		System.out.println(set1.contains('I'));
		// iteration set1 via loop
		for(Character temp:set1)
		{
			System.out.println(temp);
		}
		System.out.println("Iterating treeset");
		//iteration set2 via iterator
		Iterator<Character> it=set2.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
