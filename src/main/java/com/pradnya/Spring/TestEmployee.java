package com.pradnya.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.pradnya.Spring.dto.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee employee= (Employee) factory.getBean("Ved");
		System.out.println(employee.getName());
		System.out.println(employee.getMob());
		System.out.println(employee.getDept());
		
		Employee employee1= (Employee) factory.getBean("Nidhi");
		System.out.println(employee1.getName());
		System.out.println(employee1.getMob());
		System.out.println(employee.getDept());
		
		Employee employee2= (Employee) factory.getBean("Diksha");
		System.out.println(employee2.getName());
		System.out.println(employee2.getMob());
		System.out.println(employee2.getDept());
	}

}
