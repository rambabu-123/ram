package ram;
import java.util.Scanner;

public class Phone {
	
public static void main(String [] args)

	     {
	String name[]={"ram, Rose","ramesh, July","vasu, kantireedi","kesav, puli" };

	      String phone[]={"67463333",      "76653325626",    "6533525",     "636532672"};    

	      String n;

	      int i;

	      boolean found=false;
	      Scanner in=new Scanner(System.in);

	      System.out.print("enter a name or the first character of a name: ");

	      n=in.next();
	     // System.out.println(name[].toUpperCase());
//System.out.println(name[].toLowerCase());

	      for(i=0;i<name.length;i++)
	
	         {
	    	  if(name[i].indexOf(n)>=0)
	             {System.out.println(name[i]+": "+phone[i]);

	             found=true;

	              }

	          }

	       if(!found)
	           System.out.println(n+" not found in the phone list");
	      }
	}


