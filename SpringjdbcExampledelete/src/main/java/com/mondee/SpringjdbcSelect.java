package com.mondee;

import java.beans.Statement;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringjdbcSelect {
JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void selectEx() {
	String updateQuery = "update Student set sid = ?,marks=? where sname= ?";
	int sid = 12345;
	int marks=90;
	String sname="ramesh";
	jt.update(updateQuery, sid, marks,sname);
	}
private static int change(Object student) {
	// TODO Auto-generated method stub
	return 0;
}	
}

