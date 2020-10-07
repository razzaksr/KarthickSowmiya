package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.Random;

public class OTP 
{
	public static void main(String[] args) 
	{
		Random ran=new Random();
		String otp="";
		for(int dig=1;dig<=4;dig++)
		{
			otp+=ran.nextInt(10);
		}
		System.out.println("OTP is: "+otp);
	}
}
