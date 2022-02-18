package com.mondee;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringjdbcSelect {
private static final String INSERT_SQL = null;
JdbcTemplate jt;

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void selectEx(){

     String insertSql ="INSERT INTO student " +" sid, " +" sname, " + " marks, " +"VALUES (?, ?, ?)";
 
   // private static DataSource dataSource;
    
         
        saveRecord(123,"rambabu",500);
        saveRecord(1435,"rakk",590);
         
    }
 
        private void saveRecord(int i, String string, int j) {
	// TODO Auto-generated method stub
	
}

		// execute insert query to insert the data
        // return number of row / rows processed by the executed query
       
   
  
private static int change(Object student) {
	// TODO Auto-generated method stub
	return 0;
}	
}

