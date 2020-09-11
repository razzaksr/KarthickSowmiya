package karthick.mca.sowmiya.KarthickMca.array;

public class Changes 
{
	public static void main(String[] args) 
	{
		float[] bikes= {1.75F,0.87F,0.98F,0.65F,0.56F,1.03F,3.5F};
		System.out.println("Updating all by 8 percent due to transport charges");
		for(int index=0;index<bikes.length;index++)
		{
			System.out.println("Before Covid19: "+bikes[index]);
			bikes[index]+=(bikes[index]*8)/100;
			System.out.println("After Covid19: "+bikes[index]);
		}
		System.out.println("Updating selective bikes due to onroad tax hike");
		for(int pos=0;pos<bikes.length;pos++)
		{
			if(bikes[pos]>=0.80F&&bikes[pos]<1.20F)
			{bikes[pos]+=(bikes[pos]*4)/100;
			System.out.println(pos+" after 4 percent "+bikes[pos]);}
			else if(bikes[pos]>=1.20F)
			{bikes[pos]+=(bikes[pos]*6)/100;
			System.out.println(pos+" after 6 percent "+bikes[pos]);}
		}
	}
}