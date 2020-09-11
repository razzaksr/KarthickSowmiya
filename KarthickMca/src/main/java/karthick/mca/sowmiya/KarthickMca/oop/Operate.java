package karthick.mca.sowmiya.KarthickMca.oop;

public class Operate 
{
	public static void main(String[] args) 
	{
		Bus b1=new Bus();b1.setTravels("Kallada");b1.setAm("GPS");
		b1.setOrigin("Chennai");b1.setStop("Salem");b1.setPrice(900);
		b1.setSeats(30);b1.setType("Semi Sleeper");
		b1.hai();
		System.out.println(b1.getAm()+" "+b1.getStop());
		Bus b2=new Bus("KPN","Salem","Bangalore","AC Seater","GPS",30,900,8765678L);
		System.out.println(b2);
	}
}
