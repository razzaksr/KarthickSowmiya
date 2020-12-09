package karthick.mca.sowmiya.KarthickMca.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface KarthiOuter extends Remote
{
	public double loanInfo(int amt, int years, float intrest)throws RemoteException;
}
