package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Secure 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\hai.zip");
		/*FileOutputStream fos=new FileOutputStream(file);
		DeflaterOutputStream ds=new DeflaterOutputStream(fos);
		System.out.println("Please enter the txt to add in the file");
		String content=scan.nextLine();
		ds.write(content.getBytes());
		ds.close();fos.close();
		System.out.println(file.getAbsolutePath()+" content written");*/
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream iis=new InflaterInputStream(fis);
		byte[] temp=new byte[fis.available()];
		iis.read(temp);
		iis.close();fis.close();
		String readed=new String(temp);
		System.out.println(file.getAbsolutePath()
				+"\nContains the following content\n"+readed);
	}
}
