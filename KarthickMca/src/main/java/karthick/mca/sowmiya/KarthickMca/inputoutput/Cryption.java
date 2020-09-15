package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import karthick.mca.sowmiya.KarthickMca.oop.Bus;

public class Cryption 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\secure.doc");
		// Serialization: writing object into file
		Bus bus1=new Bus("KPN","Salem","Madurai","AC","GPS",35,420,87678987L);
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(bus1);
		oos.close();fos.close();
		System.out.println(bus1+" has written in side "+file.getAbsolutePath());
		
		// Deserialization
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Bus temp=(Bus)ois.readObject();
		ois.close();fis.close();
		System.out.println(temp+" has got from "+file.getAbsolutePath());
	}
}