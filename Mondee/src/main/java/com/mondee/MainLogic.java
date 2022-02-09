package com.mondee;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class MainLogic {
	public static void main(String args[])
	{
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();
	    Query qr=session.createQuery("from student s");
	    List li=qr.list();
	    System.out.println(li);
	    Iterator i=li.iterator();
	    while(i.hasNext())
	    {
	    	 student st=(student)i.next();
	    	 System.out.println(st.getSid()+" "+st.getName()+" "+st.getMarks());
	    }
	 
		
	   //session.save(st);
	    t.commit();
	    session.close();
		
	}

}