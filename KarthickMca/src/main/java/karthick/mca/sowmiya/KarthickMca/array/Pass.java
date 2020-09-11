package karthick.mca.sowmiya.KarthickMca.array;

public class Pass
{
	public static void hai(String one) 
	{
		System.out.println(one);
		one="Richard";
		System.out.println(one);
	}
	public static void alter(String[] two)
	{
		two[1]="Koyamputhhor";
		System.out.println("Changes in alter: "+two[1]);
	}
	public static void main(String[] args) 
	{
		String[] danger= {"Madhurai","Chengalpattu","Veeloor","Chennai","Villupuram","Kadaloor"};
		Pass.hai(danger[1]);System.out.println("In main "+danger[1]);
		Pass.alter(danger);System.out.println("In main "+danger[1]);
	}
}
