package com.mondee;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
	}
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Restaruant resta=(Restaruant)context.getBean("restaurantBean");
	resta.prepareIHotDrink();
	}

