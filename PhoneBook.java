package ram;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {
	String name;
	int number;
	long num;
	public PhoneBook(String name, long num)
	{
		this.name = name;
		this.num = num;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String toString() {
    	return ""+this.name+" "+this.num;
    }
	public static void main(String[] args)
	{
		PhoneBook p1=new PhoneBook("ram",12345);
		PhoneBook p2=new PhoneBook("ramesh",12345);
		PhoneBook p3=new PhoneBook("sanju",12345);
		PhoneBook p4=new PhoneBook("ja",12345);
		ArrayList<PhoneBook> Phonebook=new ArrayList<PhoneBook>();
		Phonebook.add(p1);
		Phonebook.add(p2);
		Phonebook.add(p3);
		for(PhoneBook b:Phonebook) {
			System.out.println(b.name +""+b.num);
			
		}
		Iterator<PhoneBook> iterator=Phonebook.iterator();
		while((iterator.hasNext()))
		{
			System.out.println(iterator.next());
		}
	}
}
