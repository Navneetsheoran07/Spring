package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HobbyTest {

	public static void main(String[] args) {
		
		ApplicationContext c= new ClassPathXmlApplicationContext("hobby.xml");
		Stud s =(Stud)c.getBean("s1");
		s.Showdata();

	}

}
