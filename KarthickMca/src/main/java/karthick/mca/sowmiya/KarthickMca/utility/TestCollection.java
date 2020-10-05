package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.List;
import java.util.Stack;

/*
 * Stack:
 * push
 * pop
 * peek
 * search
 * clear
 */

public class TestCollection 
{
	public static void main(String[] args) 
	{
		Stack common=new Stack();
		common.push(78);common.push(12.5);
		common.push("Zealous");common.push(1.56F);
		common.push(false);common.push('Y');
		System.out.println(common);
		System.out.println(common.search(12.5));
		System.out.println("Removed is: "+common.pop());
		System.out.println(common.search('Y'));
		System.out.println(common.isEmpty());
		System.out.println("Top one is: "+common.peek());
		common.clear();
		System.out.println(common);
		
		List<Integer> spec=new Stack<Integer>();
		spec.add(89);spec.add(91);spec.add(0,93);spec.add(89);
		System.out.println(spec);
		spec.remove((Object)89);
		System.out.println(spec.indexOf(89));
	}
}
