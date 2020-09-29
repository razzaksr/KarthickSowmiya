package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyUtil 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\utilityWrite.txt");
		File dest=new File("C:\\Users\\DOLL\\Desktop\\Java\\vijayamam\\copiedbyUtilityWrite.txt");
		FileUtils.copyFile(src, dest);
		System.out.println(src.getAbsolutePath()+" has copied to \n"+dest.getAbsolutePath());
		File fold=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava");
		FileUtils.copyFileToDirectory(src, fold);
		System.out.println(src.getAbsolutePath()+" has copied to\n"+dest.getAbsolutePath());
	}
}
