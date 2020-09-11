package karthick.mca.sowmiya.KarthickMca.language;

import java.io.IOException;
import java.util.Scanner;

public class Prompt 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		Runtime run=Runtime.getRuntime();
		System.out.println("Tell us which you need to open: ");
		Process pro=run.exec(scan.next());
	}
}
