package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\HowYouDoing.java");
		FileReader r=new FileReader(file);
		int each;
		System.out.println(file.getAbsolutePath()+" Contains following");
		while((each=r.read())!=-1)
		{
			System.out.print((char)each);
		}
		r.close();
	}
}
