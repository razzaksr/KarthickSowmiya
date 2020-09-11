package karthick.mca.sowmiya.KarthickMca.language;

public class Manual 
{
	public static void main(String[] args) 
	{
		String temp="null ";
		try
		{
			System.out.println(temp.endsWith(""));
			throw new NumberFormatException();
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
		catch(NumberFormatException nums)
		{
			System.out.println(nums);
		}
	}
}