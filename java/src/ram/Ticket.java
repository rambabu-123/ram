package ram;
import java.util.*;
public class Ticket {
String name,coach;
long mobno;
int nop;
int amt, totalamt;
Scanner s=new Scanner(System.in);
void accept()
{
	System.out.print("enter name");
name=s.nextLine();
System.out.print("enter type of the coach");
name= s.nextLine();
System.out.print("enter mobile no");
name=s.nextLine();
System.out.print("enter no of passengers");
nop=s.nextInt();

}
void calculate()
{
	if(coach.equals("first_ac"))
	{
		amt=700;
		totalamt=amt*nop;
	}
	
	 if(coach.equals("second_ac"));
	{
		amt=500;
		totalamt=amt*nop;
	}
	
	else if(coach.equals("third_ac"));
	{
		amt=250;
		totalamt=amt*nop;
	}
	
	else
	{
		amt=0;
	}
}
void update() {
	System.out.print("name:"+name);
	System.out.print("enter type of coach"+coach);
	System.out.print("mobile"+mobno);
	System.out.print("number of passengers:"+nop);
	
}
 void display(){
	 System.out.print("name:"+name);
		System.out.print("enter type of coach"+coach);
	 System.out.print("number of passenngers:"+nop);
	 System.out.print("amt is:"+amt);
	 System.out.print("totalamt is:"+totalamt);
}


}
