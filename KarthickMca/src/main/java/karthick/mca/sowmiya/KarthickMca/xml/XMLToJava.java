package karthick.mca.sowmiya.KarthickMca.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToJava 
{
	public static void main(String[] args) throws JAXBException 
	{
		JAXBContext con=JAXBContext.newInstance(Bus.class);
		File file=new File("Mohamed.xml");
		Unmarshaller unmars=con.createUnmarshaller();
		Bus temp=(Bus)unmars.unmarshal(file);
		System.out.println(temp);
	}
}
