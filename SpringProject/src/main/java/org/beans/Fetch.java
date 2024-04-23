package org.beans;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Fetch {

	JdbcTemplate jt;

	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public void loadAll() {
		List l = jt.queryForList("select *from student");
		Iterator it =l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
