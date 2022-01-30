package ram;

import java.util.Scanner;

public class Wrapper {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter firstname");
	String firstname=sc.next();
	System.out.println("enter lastname");
	String lastname=sc.next();
	System.out.println("enter userid");
	String userid=sc.next();
	System.out.println( "The password");
	System.out.println((firstname.substring(0,3)).toUpperCase()+(lastname.substring(0,3)).toUpperCase()+
			(userid.substring(userid.length()-3)).toUpperCase());

	
}
}
