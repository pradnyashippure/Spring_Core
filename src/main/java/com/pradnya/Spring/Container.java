package com.pradnya.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pradnya.Spring.dto.Details;

public class Container {
	public static void main(String[] args) {
	Resource resource = new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Details details= (Details) factory.getBean("sakshi");
	System.out.println(details.getName());
	System.out.println(details.getEmail());
	
	Details details1= (Details) factory.getBean("details");
	System.out.println(details1.getName());
	System.out.println(details1.getEmail());
	
	Details details2= (Details) factory.getBean("prajakta");
	System.out.println(details2.getName());
	System.out.println(details2.getEmail());
	}

}
