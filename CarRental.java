package ram;
import java.util.Scanner;
public class CarRental {
	private static int n;
	static int total=0;
	static double chrges=0;
	static  void calculateCharges(int hr, int carno)
	{
		double rent=0.0;
		total=total+hr;
		//chrges=chrges+rent;
		int temp=hr;
		int val=0;
		while(true)
		{
			if(hr<=8)
			{
			rent=25.0;
			break;
			}
			else if(hr>8 && hr<=24)
			{
				rent=rent+50+(temp*0.5);
				break;
			}
			else
			{
				val=hr-24;
				rent+=50;
			
			}
			hr=val;
		}
		chrges=chrges+rent;
		System.out.println(carno+"       "+temp+"       "+(rent));
	}
	public static void main(String[] args)
	{
		int carNo=0;
		int hrs=0;
		System.out.println("CarNo   "+"hours   "+"charge");
		System.out.println("======================");
		Scanner sc=new Scanner(System.in);
		calculateCharges(12,1);
		calculateCharges(34,2);
		calculateCharges(48,3);
		//calculateCharges(8,4);
		System.out.print("Total\t"+total+"\t"+chrges++);
	
		 
	}

}
