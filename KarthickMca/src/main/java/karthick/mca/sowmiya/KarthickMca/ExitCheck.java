package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

public class ExitCheck 
{
	public static void main(String[] args) 
	{
		String skill="";int count=0;
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("Tell us ur skill set: ");
			skill=scan.nextLine();
			switch(skill)
			{
			case "data science":case "angular":case "java":case "python":case "javascript":
				System.out.println("U r hired @"+count);count--;break;
			default:System.out.println("Update ur skill set");
			}
		}while(count>0);
		scan.close();
	}
}