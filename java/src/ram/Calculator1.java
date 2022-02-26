package ram;
import java.util.*;
import java.lang.Exception;//importing Exception class

public class Calculator1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	try {
		System.out.println("enter number:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("enter the operator:");
		char c = s.next().charAt(0);
		if(c=='+')
		{
			System.out.println(n1+n2);
		}
		else if(c=='-')
		{
			System.out.println("n1-n2");
		}
		else if(c=='*')
		{
			System.out.println("n1*n2");
		}
		else if(c=='/')
		{
			System.out.println("n1/n2");
		}
	}
	catch(Exception e) {
		
	    System.out.println("exception"+e);
	}
         
	}
}
