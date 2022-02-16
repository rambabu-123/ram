package com.mondee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic{
	public static void main(String args[])
	{
		 ApplicationContext ac = (ApplicationContext) new ClassPathXmlApplicationContext("Spring.xml");
		Student cr = (Student) ac.getBean("ram");
		System.out.println(cr.getSname()+" "+cr.getSid()+" "+cr.getSmarks());
		
	}

}
