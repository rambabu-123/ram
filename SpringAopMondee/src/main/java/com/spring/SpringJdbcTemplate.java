package com.spring;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.mondee.Student;

@Component
public class SpringJdbcTemplate {
	
	NamedParameterJdbcTemplate njt;

	public NamedParameterJdbcTemplate getNjt() {
		return njt;
	}

	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}

	public void select() {

		String sql = "select * from student";

		Student result = njt.query(sql,new ResultSetExtractor<Student>() {

			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Student st = new Student();
					st.setId(rs.getInt("sid"));
					st.setName(rs.getString("sname"));
					st.setMarks(rs.getInt("marks"));
					System.out.println(st);
				}
				return null;
			}
		});
	}

}