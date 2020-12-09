package karthick.mca.sowmiya.KarthickMca.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Borrower 
{
	public Borrower()
	{
		try {
			KarthiOuter k=(KarthiOuter)Naming.lookup("localhost/karthi");
			System.out.println(k.loanInfo(80000, 3, 9.8F));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		Borrower bow=new Borrower();
	}
}
