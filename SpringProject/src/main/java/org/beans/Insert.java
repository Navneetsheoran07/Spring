package org.beans;

import org.springframework.jdbc.core.JdbcTemplate;

public class Insert {

	
	JdbcTemplate jt;

	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	public void insertRow() {
		int k = jt.update("insert into student values(1,'Kunal','java','kunal@gmail.com','Mohali')");
		System.out.println("insertion successfully");
	}
}
