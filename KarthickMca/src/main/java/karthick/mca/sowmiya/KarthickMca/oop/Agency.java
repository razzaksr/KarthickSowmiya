package karthick.mca.sowmiya.KarthickMca.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Agency implements BusProcesses 
{
	Bus[] tours;
	Scanner scan=new Scanner(System.in);
	public Agency() 
	{System.out.println("TEll us how manny busses in your agency");
	tours=new Bus[scan.nextInt()];}
	@Override
	public void add(Bus bus) {
		// TODO Auto-generated method stub
		for(int index=0;index<tours.length;index++)
		{
			if(tours[index]==null)
			{tours[index]=bus;System.out.println("New bus added @"+index);break;}
		}
	}
	@Override
	public Bus[] getOne(String travels) {
		// TODO Auto-generated method stub
		Bus[] tmp= new Bus[10];
		int pos=0;
		for(int index=0;index<tours.length;index++)
		{
			if(tours[index]!=null&&tours[index].getTravels().equals(travels))
			{
				tmp[pos]=tours[index];pos++;
			}
		}
		return tmp;
	}
	@Override
	public void remove(Bus bus) {
		// TODO Auto-generated method stub
		for(int index=0;index<tours.length;index++)
		{
			if(tours[index]!=null&&tours[index].getRegno()==bus.getRegno())
			{
				tours[index]=null;// deletion
				System.out.println(bus.getRegno()+" removed @ "+index);
			}
		}
	}
	@Override
	public Bus update(Bus bus) {
		// TODO Auto-generated method stub
		for(int index=0;index<tours.length;index++)
		{
			if(tours[index]!=null&&tours[index].getRegno()==bus.getRegno())
			{
				tours[index]=bus;
			}
		}
		return bus;
	}
	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("Listing all");
		for(Bus temp:tours)
		{
			if(temp!=null) {System.out.println(temp);}
		}
	}
	public static void main(String[] args) {
		Agency agent=new Agency();
		Bus b1=new Bus("KPN", "Salem", "Chennai", "AC", "GPS", 25, 500,9876555L);
		Bus b2=new Bus("Kallada", "Salem", "Chennai", "SL", "GPS", 20, 1000,5678765676L);
		Bus b3=new Bus("Kallada", "Mumbai", "Chennai", "UD", "GPS", 10, 1900,7654567L);
		Bus b4=new Bus("Kallada", "Salem", "Chennai", "AC", "GPS", 20, 1000,6456789L);
		agent.add(b1);
		agent.add(b2);
		agent.add(b3);
		agent.add(b4);
		System.out.println(Arrays.toString(agent.getOne("Kallada")));
		System.out.println(agent.update(new Bus("KPN", "Salem", "Bangalore", "UD", "Nill", 25, 500,9876555L)));
		agent.listAll();
		agent.remove(b3);
		agent.listAll();
	}
}
