package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadUtil 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\utilityWrite.txt");
		String data=FileUtils.readFileToString(file);
		System.out.println(data+"\nhas fetched from \n"+file.getAbsolutePath());
	}
}
