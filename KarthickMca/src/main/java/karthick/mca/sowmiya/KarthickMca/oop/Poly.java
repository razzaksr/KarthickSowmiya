package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;

public class Poly 
{
	String screen;
	int[] type;
	public Poly() 
	{System.out.println("Default called");screen="";type=new int[4];}
	// count based
	public Poly(String screen, int[] type) {
		this.screen = screen;
		this.type = type;
	}
	public Poly(int[] hai,String b)
	{
		this.screen = b;
		this.type = hai;
	}
	@Override
	public String toString() {
		return "Poly [screen=" + screen + ", type=" + Arrays.toString(type) + "]";
	}
	public static void main(String[] args) 
	{
		Poly p1=new Poly();p1.screen="Dhevi";p1.type= new int[]{100,300,400,1000};
		//p1.type[0]=100;p1.type[1]=300;p1.type[2]=400;p1.type[3]=1000;
		int[] temp= {200,500,300};
		Poly p2=new Poly("Udhayam",temp);
		Poly p3=new Poly(new int[] {700,100,40},"Oscars");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
