package com.mondee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpringJdbcSelect s=ac.getBean(SpringJdbcSelect.class);
		
		s.insert();
		s.selectEx();
	}

}