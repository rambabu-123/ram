package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringjdbcSelect {
JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void selectEx() {
	List li=jt.queryForList("select * from student");
	Iterator i=li.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
	
}
}
