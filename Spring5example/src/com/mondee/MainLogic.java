package com.mondee;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainLogic {
	
 public static void main(String args[]) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    Student obj = (Student) context.getBean("ram");
	    System.out.println(obj.getSid()+ " "+obj.getSname()+" "+obj.getSmarks());
 }
}