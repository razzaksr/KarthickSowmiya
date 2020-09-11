package karthick.mca.sowmiya.KarthickMca.language;

public class TestStringClass 
{
	public static void main(String[] args) 
	{
		String obj1=new String("Employability");// non literal
		System.out.println(obj1);
		String obj2="Empowerment";// literal
		System.out.println(obj2);
		System.out.println(obj1.length()+" "+obj2.length());
		System.out.println(obj1.charAt(8));
		System.out.println(obj2.concat(" conference   "));// immutable
		System.out.println(obj2);
		obj2=obj2.concat("System not in home");//immutable
		System.out.println(obj2);
		obj1=obj1.concat(" Skills in Zealous   ");
		System.out.println(obj1+" "+obj1.length());
		obj1=obj1.trim();
		System.out.println(obj1.length());
		System.out.println(obj2.equalsIgnoreCase("empowermentsystem not in home"));
		System.out.println(obj1.compareTo("Employability Skills in Zealous"));
		System.out.println(obj2.contains("power"));
		System.out.println(obj2.getBytes());
		System.out.println(obj1.substring(7, 10));
	}
}
