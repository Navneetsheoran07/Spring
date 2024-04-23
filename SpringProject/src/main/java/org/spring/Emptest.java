package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emptest {

	public static void main(String[] args) {
	ApplicationContext t = new ClassPathXmlApplicationContext("emp.xml");
	Employee ems =(Employee)t.getBean("employe");
	ems.Info();
	}

}
