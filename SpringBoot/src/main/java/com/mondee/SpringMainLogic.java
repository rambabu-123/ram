package com.mondee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMainLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ac = SpringApplication.run(SpringMainLogic.class,args);
		
		StudentDao sd = ac.getBean(StudentDao.class,args);
		
		Student st = new Student();
		st.setId(6);
		st.setMarks(123);
		st.setSname("ram");
		sd.insert(st);

	}

}