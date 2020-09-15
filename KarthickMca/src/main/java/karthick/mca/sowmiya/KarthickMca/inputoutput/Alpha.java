package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alpha 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\weds.doc");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the txt to add in the file");
		String content=scan.nextLine();
		FileWriter w=new FileWriter(file);
		w.write(content);
		w.close();
		System.out.println("Data written in the file: "+file.getAbsolutePath());
	}
}
