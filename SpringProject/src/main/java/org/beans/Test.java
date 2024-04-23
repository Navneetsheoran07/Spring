package org.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("springone.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Insert in = (Insert)factory.getBean("id3");
		in.insertRow();
		
		
		ApplicationContext a = new ClassPathXmlApplicationContext("springtwo.xml");
		Fetch f = (Fetch)a.getBean("id3");
		f.loadAll();
		
	}
}
