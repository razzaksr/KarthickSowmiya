package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("E:\\Buj backup\\JAVA & J2EE\\PDF's\\jdkpathconfigs.txt");
		FileInputStream fis=new FileInputStream(file);
		byte[] temp=new byte[fis.available()];
		fis.read(temp);
		fis.close();
		String readed=new String(temp);
		System.out.println(file.getAbsolutePath()
				+"\nContains the following content\n"+readed);
	}
}