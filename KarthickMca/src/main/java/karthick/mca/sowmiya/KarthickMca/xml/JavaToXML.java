package karthick.mca.sowmiya.KarthickMca.xml;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JavaToXML 
{
	public static void main(String[] args) throws JAXBException, IOException 
	{
		Bus b=new Bus("Kallada", "Salem", "Bangalore", "AC Seater", "GPS", 35, 760, 544192);
		JAXBContext con=JAXBContext.newInstance(Bus.class);
		Marshaller mars=con.createMarshaller();
		mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		mars.marshal(b, new FileOutputStream("Karthi.xml"));
		System.out.println("XML Created successfully");
	}
}
