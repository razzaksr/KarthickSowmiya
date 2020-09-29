package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Truncate 
{
	public static void main(String[] args) throws IOException 
	{
		/*File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\EB\\different.txt");
		FileUtils.forceDelete(file);
		System.out.println("File deleted");*/
		/*File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\newfolder");
		FileUtils.cleanDirectory(file);
		System.out.println("All files are deleted from "+file.getAbsolutePath());*/
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\newfolder");
		FileUtils.deleteDirectory(file);
		System.out.println("Folder has deleted");
	}
}
