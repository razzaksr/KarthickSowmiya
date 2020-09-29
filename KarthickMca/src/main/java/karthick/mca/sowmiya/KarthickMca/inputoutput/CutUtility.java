package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CutUtility 
{
	public static void main(String[] args) throws IOException 
	{
		/*File src=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\utilityWrite.txt");
		File dest=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\EB\\different.txt");
		FileUtils.moveFile(src, dest);
		System.out.println(src.getAbsolutePath()+" has cut paste to\n"+dest.getAbsolutePath());*/
		File src=new File("C:\\Users\\DOLL\\Desktop\\Java\\vijayamam\\copiedbyUtilityWrite.txt");
		File fold=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\newfolder");
		FileUtils.moveFileToDirectory(src, fold, true);
		System.out.println(src.getAbsolutePath()+" has cut paste to the folder\n"+fold.getAbsolutePath());
	}
}
