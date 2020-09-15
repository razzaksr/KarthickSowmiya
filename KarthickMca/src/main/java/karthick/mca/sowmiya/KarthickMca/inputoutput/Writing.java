package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing 
{
	public static void main(String[] args) throws IOException 
	{
		String userData="";
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\valid.txt");
		DataInputStream ds=new DataInputStream(System.in);
		System.out.println("Please type anything to write in "+file.getAbsoluteFile());
		userData=ds.readLine();
		FileOutputStream fos=new FileOutputStream(file);
		byte[] temp=userData.getBytes();
		fos.write(temp);
		System.out.println(userData+" has written in "+file.getAbsolutePath());
		fos.close();
		ds.close();
	}
}
