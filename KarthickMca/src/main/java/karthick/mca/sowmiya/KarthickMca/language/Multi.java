package karthick.mca.sowmiya.KarthickMca.language;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi 
{
	public static void main(String[] args) 
	{
		// number=90, hai[pos]=5. 90/5>> 18
		short[] hai= {2,8,0,1,5,9};
		Scanner scan=new Scanner(System.in);
		int pos=0, number=0;
		try
		{
			System.out.println("Enter the number: ");
			number=scan.nextInt();
			System.out.println("Choose the divider by index: ");
			pos=scan.nextInt();
			System.out.println(number/hai[pos]);
		}
		catch(InputMismatchException mis)
		{
			Scanner get=new Scanner(System.in);
			System.out.println(mis+"\nData's should be numeric: ");
			number=get.nextInt();
			System.out.println("Choose the divider by index: ");
			pos=get.nextInt();
			System.out.println(number/hai[pos]);
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar+"\nChoose the divider by index within: "+hai.length);
			pos=scan.nextInt();
			System.out.println(number/hai[pos]);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\nChoose the divider by index within: "+
		hai.length+" also except 2nd");
			pos=scan.nextInt();
			System.out.println(number/hai[pos]);
		}
		catch(Exception exe)
		{
			System.out.println(exe);
		}
		finally
		{
			System.out.println("Divide operation done");
		}
	}
}