package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
        Resource r =new ClassPathResource("spring.xml");
        BeanFactory f = new XmlBeanFactory(r);
        Student s = (Student)f.getBean("st");
        Student s2 = (Student)f.getBean("st2");
        s.display();
        s2.display();
    }
}
