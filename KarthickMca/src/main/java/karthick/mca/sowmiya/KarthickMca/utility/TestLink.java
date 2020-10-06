package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.LinkedList;

/*
 * LinkedList:
 * Insertion:add/addLast, addFirst, add(index,object)
 * Read: get(index), getFirst(), getLast()
 * Deletion: remove/removeFirst, removeLast, remove(index), remove(Object)
 * Contains(object)>> true/false
 * indexOf(object)>> pos
 * 
 */

public class TestLink 
{
	public static void main(String[] args) 
	{
		LinkedList<String> skill=new LinkedList<String>();
		skill.add("C");skill.add("C++");skill.addFirst("Java");
		skill.add(1,"Python");
		System.out.println(skill);
		skill.remove();
		System.out.println(skill.getFirst());
		skill.remove(2);
		System.out.println(skill.contains("C++"));
		skill.set(1, "Spring");
		System.out.println(skill);
		System.out.println(skill.get(1));
		System.out.println(skill.indexOf("C++"));
	}
}
