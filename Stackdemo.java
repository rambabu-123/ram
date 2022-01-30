package ram;

import java.util.Stack;

public class Stackdemo
	{
	int arr[];
	int top=-1;
	int size=0;
	Stackdemo(int size)
	{
	arr=new int[size];
	this.size=size;
	}
	Boolean isempty()
	{
	if(top==-1)
	return true;
	else
	return false;

	}
	void push(int item)
	{
	if(top==-1)
	{
	top++;
	arr[top]=item;
	}
	else
	{
	top++;
	arr[top]=item;
	}
	}

	boolean isFull()
	{
	if(arr.length==size)
	return true;
	else
	return false;
	}
	void display()
	{
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	}
		   public static void main(String args[]) {
	 
		      Stack st = new Stack();
		      st.push(10);
		      st.push(20);
		      st.push(30);
		      st.push(10);
		      System.out.println("Removed object is: "+st.pop());
		      System.out.println("Removed object is: "+st.pop());
	  
		     
		      System.out.println("Elements after remove: "+st);
		   }    

	}


