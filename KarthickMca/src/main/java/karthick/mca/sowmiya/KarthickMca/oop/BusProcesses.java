package karthick.mca.sowmiya.KarthickMca.oop;


//create read update delete list
public interface BusProcesses
{
	public void add(Bus bus);// create
	public Bus[] getOne(String travels);// read
	public void remove(Bus bus);// delete
	public Bus update(Bus bus);// update
	public void listAll();// list
}
