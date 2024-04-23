package org.spring;

public class Employee {

	private int id,salary;
	private String name,post,address;
	public Employee(int id, int salary, String name, String post, String address) {
	
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.post = post;
		this.address = address;
	}
	public void Info() {
		System.out.println(id+" "+name+" "+post+" "+salary+" "+ address);
	}
}
