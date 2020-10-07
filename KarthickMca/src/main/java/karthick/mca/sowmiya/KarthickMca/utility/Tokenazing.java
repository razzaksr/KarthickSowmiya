package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.StringTokenizer;

public class Tokenazing 
{
	public static void main(String[] args) 
	{
		String para="Orange, Salem, Chennai,AC, GPS, 25, 500,9876555L";
		StringTokenizer tok=new StringTokenizer(para," ,");
		System.out.println(tok.countTokens());
		while(tok.hasMoreTokens())
		{
			System.out.println(tok.nextToken());
		}
	}
}
