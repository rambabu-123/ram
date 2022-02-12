 package com.mondee;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainLogic {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().build();
		Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=me.getSessionFactoryBuilder().build();
		Session se=sf.openSession();
		Transaction tx = se.beginTransaction();
	
		Vendor v = new Vendor();
		
		((Vendor) v).setVendorId(111);
		v.setVendorName("Flipkart");

		Customers c1 = new Customers();
		c1.setCustomerId(222);
		c1.setCustomerName("Aarav");
		
		Customers c2 = new Customers();
		c2.setCustomerId(333);
		c2.setCustomerName("Keerthan");
		
		Set set = new HashSet();
		set.add(c1);
		set.add(c2);
		
		Person pe = new Person();
		pe.setPersonId(101);
		pe.setPersonName("Amrutha");
		
		PanCard pan = new PanCard();
		pan.setPanCardId(201);
		pan.setPanCardNo("DNKPA1246399");
		pan.setObj(pe);
		
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Amrutha");
		
		Student st2 = new Student();
		st2.setStudentId(102);
		st2.setStudentName("Aarav");
		
		Student st3 = new Student();
		st3.setStudentId(103);
		st3.setStudentName("Keerthan");
		
		Set set1 = new HashSet();
		set1.add(st);
		set1.add(st2);
		set1.add(st3);
		
		Course c = new Course();
		c.setCourseId(201);
		c.setCourseName("Java");
		
		Course cs = new Course();
		cs.setCourseId(202);
		cs.setCourseName("React Js");
		
		Set set2 = new HashSet();
		set.add(c);
		set.add(cs);
		
		st2.setObj(set2);
		c.setObj2(set1);
		cs.setObj2(set1);
		
		se.save(c);
		se.save(cs);
		se.save(st);
		
		//se.save(pe);
		//se.save(pan);
		
		//v.setObj(set);
		
		//se.save(v);
		
		tx.commit();
		se.close();
	}
}
