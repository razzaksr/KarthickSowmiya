package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Append 
{
	public static void main(String[] args) throws IOException
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\utilityWrite.txt");
		Scanner sscan=new Scanner(System.in);
		System.out.println("Tell us content wish to add");
		FileUtils.writeStringToFile(file, sscan.nextLine(), true);
		System.out.println(file.getAbsolutePath()+" Content added");
	}
}
