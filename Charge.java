package ram;
import java.util.Scanner;
public class Charge {
	static void calcharge(int hr)
	{
	
		double cost = 0;
		if(hr<=8)
			cost=25.0;
		else if(hr>8 && hr<24)
		{
			cost=(hr-8)*5+25;
			
		}
		else if(hr>=24 && hr<=72)
		{
			int day=hr/24;
			System.out.print("day"+day);
			cost=day*50;
			int h=hr/24;
			cost=cost+h*5;
		}
		double st=hr*0.5;
		double charges=cost+st;
		System.out.println( "chrge is"+charges);
		
	}
	public static void main(String[] args)
	{
		calcharge(30);
		 calcharge(40);
		 calcharge(50);
	}
}

