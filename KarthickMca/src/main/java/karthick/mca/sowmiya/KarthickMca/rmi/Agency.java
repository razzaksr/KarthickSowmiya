package karthick.mca.sowmiya.KarthickMca.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Agency extends UnicastRemoteObject implements KarthiOuter
{

	protected Agency() throws RemoteException 
	{
		super();
		try {
			Naming.rebind("localhost/karthi", this);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public double loanInfo(int amt, int years, float intrest) throws RemoteException {
		// TODO Auto-generated method stub
		double total=(amt*intrest)/100;
		total*=years;total+=amt;
		System.out.println("Emi/Month: "+(total/(years*12)));
		return total;
	}
	public static void main(String[] args) throws RemoteException {
		Agency age=new Agency();
	}

}
