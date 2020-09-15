package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

public class FileCreation 
{
	public static void main(String[] args) throws IOException 
	{
		File disc=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\basicfile.pdf");
		disc.createNewFile();
		System.out.println("File has created in "+disc.getAbsolutePath());
	}
}
