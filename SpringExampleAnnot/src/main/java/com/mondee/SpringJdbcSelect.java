package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJdbcSelect {
	
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void selectEx()
	{
		List li=jt.queryForList("select * from student");
		Iterator i=li.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
	public void insert()
	{
		jt.execute("insert into student values(143,'rohit',100)");
	}

}

