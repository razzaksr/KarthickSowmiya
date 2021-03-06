package karthick.mca.sowmiya.KarthickMca.oop;

import java.io.Serializable;

// bean/ business/ entity/ model class/ pojo
public class Bus implements Comparable<Bus>, Serializable// marked interface
{
	private String travels, origin, stop, type, am;
	private Integer seats, price;
	private Long regno;
	@Override
	public int compareTo(Bus o) {
		//return this.travels.compareTo(o.travels);
		return o.price.compareTo(this.price);
	}
	public Bus() {System.out.println("Default contructor called");}
	
	@Override
	public String toString() {
		return "Bus [travels=" + travels + ", origin=" + origin + ", stop=" + stop + ", type=" + type + ", am=" + am
				+ ", seats=" + seats + ", price=" + price + ", regno=" + regno + "]";
	}

	public Bus(String travels, String origin, String stop, String type, String am, int seats, int price, long regno) {
		super();
		this.travels = travels;
		this.origin = origin;
		this.stop = stop;
		this.type = type;
		this.am = am;
		this.seats = seats;
		this.price = price;
		this.regno = regno;
	}

	public void setTravels(String travels){this.travels=travels;}
	public String getTravels() {return travels;}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void hai()
	{
		System.out.println(this.travels+" "+this.origin+" "
	+this.stop+" "+this.am+" "+this.seats+" "+this.price);
	}
	public long getRegno() {
		return regno;
	}
	public void setRegno(long regno) {
		this.regno = regno;
	}
}