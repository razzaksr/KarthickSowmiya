package karthick.mca.sowmiya.KarthickMca.array;

import java.util.Scanner;

public class ArrFibo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us no of fibonaccies: ");
		int[] fib=new int[scan.nextInt()];
		if(fib.length>=2)
		{
			fib[0]=0;fib[1]=1;
			for(int index=2;index<fib.length;index++)
			{
				fib[index]=fib[index-1]+fib[index-2];
			}
		}
		else
		{
			System.out.println("Can't generate");
		}
		//for(int temp:fib){System.out.println(temp);}
		System.out.println("Tell us divider: ");
		int div=scan.nextInt();
		for(int temp:fib)
		{
			if(temp%div==0) {System.out.println(temp);}
		}
		scan.close();
	}
}
