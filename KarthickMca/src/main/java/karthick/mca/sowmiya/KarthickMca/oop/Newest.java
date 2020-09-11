package karthick.mca.sowmiya.KarthickMca.oop;

public class Newest extends Newyork implements Richmond 
{
	public static void main(String[] args) 
	{
		Newest ny=new Newest();
		ny.yet=13;
		ny.sayThanks();
		//Richmond nw=new Newest();// factory pattern
		//Newest nw=new Newest();// normal
		ny.sayHai();
		//ny.pet=10;// constants
		System.out.println(ny.pet);
	}

	@Override
	public void sayHai() {
		// TODO Auto-generated method stub
		System.out.println("Always keep smile");
	}
}
class Newyork
{
	int yet;
	public void sayThanks() 
	{System.out.println("Always greatful to god");}
}
interface Richmond
{
	// final var/obj
	int pet=45;
	// abstract methods: method with ; without {}
	public void sayHai(); //{System.out.println("Always keep smile");}
}