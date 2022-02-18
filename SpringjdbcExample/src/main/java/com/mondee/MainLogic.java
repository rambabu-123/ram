package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
	ApplicationContext ct= new ClassPathXmlApplicationContext("spring.xml");
    SpringjdbcSelect sj= ct.getBean(SpringjdbcSelect.class); 
    sj.selectEx();
    
	}
}
