package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class CaseScenario 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us which language you wish to learn: ");
		String lang=scan.nextLine();
		switch(lang)
		{
		case "java":case "java script":System.out.println("You need to install JDK then Eclipse/ node js to practice");
					System.out.println("You can become a full stack web/app developer");
					break;
		case "python":System.out.println("You need to install python IDLE then pycharm/ jupyter/ spyder/ eclipse to practice");
						System.out.println("You can become developer/ web developer/ data scientist/ automation engineer");
						break;
		case "php":System.out.println("Need to install xampp along with eclipse to practice");
					System.out.println("Can become a web developer");
					break;
		case "c":case "cpp":System.out.println("Need to install dev cpp/ eclipse/ turbo/ code blocks/ netbeans to practice");
					System.out.println("You can become analyst/ developer in product based sector");
					break;
		default: System.out.println(lang+" is not in demand");
		}
		scan.close();
	}
}
