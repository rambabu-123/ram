package ram;


	import java.util.*;

	public class Demo {
	   public static void main(String args[]) {
 
	      Stack st = new Stack();
	      st.push("ram");
	      st.push("babu");
	      st.push("sunkara");
	      System.out.println("Removed object is: "+st.pop());
	      System.out.println("Removed object is: "+st.pop());
  
	     
	      System.out.println("Elements after remove: "+st);
	   }    
	}
