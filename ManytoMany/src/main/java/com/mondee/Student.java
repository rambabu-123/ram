package com.mondee;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.Case;
import com.mondee.Customers;
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname")
	private String studentName;
	
	@ManyToMany(fetch=FetchType.LAZY,targetEntity = Case.class,cascade = CascadeType.ALL)
	private Set obj;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set getObj() {
		return obj;
	}

	public void setObj(Set obj) {
		this.obj = obj;
	}
	
}
