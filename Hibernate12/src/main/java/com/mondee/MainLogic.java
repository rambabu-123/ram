package com.mondee;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.Set;

public class MainLogic {
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.xml").build();
		Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=me.getSessionFactoryBuilder().build();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
	Vendor v= new Vendor();
	v.setVendorId(204);
	v.setVendorName("flipcart");
	Customers c1=new Customers();
	c1.setCustomerId(423);
	c1.setCustomerName("ram");
	Customers c2=new Customers();
	c2.setCustomerId(625);
	c2.setCustomerName("vasu");
	
HashSet s=new HashSet();
s.add(c1);
s.add(c2);
v.setObj(s);
se.save(v);

		tx.commit();
		se.close(); 
	}
}