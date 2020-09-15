package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class UtilWrite 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\utilityWrite.txt");
		FileUtils.writeStringToFile(file, "Hai how you doing?");
		System.out.println("Content written in "+file.getAbsolutePath());
	}
}
