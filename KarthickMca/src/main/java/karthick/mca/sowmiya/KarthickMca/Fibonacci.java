package karthick.mca.sowmiya.KarthickMca;

import java.util.Scanner;

/*
 * 0 1 1 2 3 5 8 13 .......
 * NUM=5>>0 1 1 2 3
 * NUM=10>0 1 1 2 3 5 8 13 21 34
 */

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int data1=0,data2=1, sum=0, mon;
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us how many fibonacci num you want: ");
		int num=scan.nextInt();
		if(num>=2)
		{
			System.out.println(data1+"\n"+data2);
			mon=3;// from where to start sum 
			while(mon<=num)
			{
				sum=data1+data2;
				data1=data2;
				data2=sum;
				System.out.println(sum);
				mon++;
			}
		}
		scan.close();
	}
}
