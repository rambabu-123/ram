package com.mondee;
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
	    student st=new student();
	    st.setSid(1);
	    st.setName("kavu");
	    st.setMarks(50);
	    session.save(st);
	    t.commit();
	    session.close();
		
	}

}
