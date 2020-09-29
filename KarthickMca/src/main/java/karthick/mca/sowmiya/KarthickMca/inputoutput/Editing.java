package karthick.mca.sowmiya.KarthickMca.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Editing 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\Morning MCA batch\\helloYar.txt");
		List<String> received=FileUtils.readLines(file);
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us desired line number to edit: "+received.size());
		int line=scan.nextInt();
		System.out.println("Content you wish to write on "+line);
		String users=scan.next();
		received.set(line, users);
		FileUtils.writeLines(file, received);
		System.out.println("Editing done @ "+line+" by "+users+" on "+file.getAbsolutePath());
	}
}
