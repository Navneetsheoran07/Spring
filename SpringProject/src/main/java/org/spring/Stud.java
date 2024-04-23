package org.spring;

import java.util.Iterator;
import java.util.List;

public class Stud {
private int id;
private String name,course;
List<Hobby>hobbylist;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public List<Hobby> getHobbylist() {
	return hobbylist;
}
public void setHobbylist(List<Hobby> hobbylist) {
	this.hobbylist = hobbylist;
}


public void Showdata() {
	System.out.println("Id is :"+id);
	System.out.println("Name is :"+name);
	System.out.println("Course is :"+course);
	
	Iterator<Hobby> itr = hobbylist.iterator();
	while (itr.hasNext()) {
	Hobby h = itr.next();
	System.out.println(h.getIndoor()+" "+h.getOutDoor());
		
		
	}
}
}
