package karthick.mca.sowmiya.KarthickMca.oop;

class Cookie
{
	String name;
	int price;
	public Cookie() {}
	public Cookie(String a,int b) {this.name=a;this.price=b;}
}
class Market
{
	Cookie[] bis= new Cookie[] {new Cookie("DarkFantasy",35),
			new Cookie("MarieGold",20),new Cookie("5050",5)};
	public void show()
	{
		System.out.println("Show from Market");
		for(Cookie temp:bis)
		{
			System.out.println(temp.name+" "+temp.price);
		}
	}
}
class Reliance extends Market
{
	public void show()
	{
		System.out.println("Show from Reliance");
		for(int index=0;index<bis.length;index++)
		{
			bis[index].price-=2;
			System.out.println(bis[index].name+" "+bis[index].price);
		}
	}
}
class Spencers extends Market
{
	public void show()
	{
		System.out.println("Show from Spencers");
		for(int index=0;index<bis.length;index++)
		{
			bis[index].price+=5;
			System.out.println(bis[index].name+" "+bis[index].price);
		}
	}
}
public class FactoryPattern 
{
	public static void main(String[] args) 
	{
		//Cookie c1=new Cookie();c1.name="Britania Gooday";c1.price=10;
		Market rel=new Reliance();
		rel.show();
		rel=new Spencers();
		rel.show();
	}
}