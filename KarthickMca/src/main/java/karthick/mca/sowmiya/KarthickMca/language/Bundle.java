package karthick.mca.sowmiya.KarthickMca.language;


/*
 * Casting between Object  to our class
 * OR
 * Casting between our class to Object
 */

public class Bundle implements Cloneable
{
	int pin;
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Bundle obj1=new Bundle();obj1.pin=636004;
		System.out.println("Object 1 "+obj1.pin);
		Bundle obj2=new Bundle();
		obj2=obj1;// copying properties from obj1 to obj2
		//obj1=obj2;
		System.out.println("Object 2 "+obj2.pin);
		obj1.pin=636003;System.out.println("Object 1 "+obj1.pin);
		System.out.println("Object 2 "+obj2.pin);
		obj2.pin=636007;System.out.println("Object 2 "+obj2.pin);
		System.out.println("Object 1 "+obj1.pin);
		// cloning
		Bundle obj3=(Bundle)obj2.clone();
		System.out.println("Object 3 "+obj3.pin);
		obj2.pin=636005;obj1.pin=624208;obj3.pin=638207;
		System.out.println("Object 1 "+obj1.pin);
		System.out.println("Object 2 "+obj2.pin);
		System.out.println("Object 3 "+obj3.pin);
		
	}
}