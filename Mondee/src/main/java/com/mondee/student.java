package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class student {
	private static final String sname = null;
	@Id
	@Column(name="sid")
private int sid;
	@Column(name="sname")
private String name;
	@Column(name="marks")
private int marks;

public student() {
	
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setSame(String name) {
	this.name = sname;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
	
}

@Override
public String toString() {
	return "student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
}

}

