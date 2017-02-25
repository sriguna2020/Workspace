package com.sriguna.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sriguna/spring/test/config/beans.xml");
		
		
		
		Person person1 = (Person)context.getBean("person");// new Person();
		
		Person person2 = (Person)context.getBean("person");
		
		person2.setId(100);
		Address address =(Address)context.getBean("address");
		
		person1.speak();
		
		System.out.println("person1---"+person1);
		System.out.println("person2---"+person2);
		
		 
		((ClassPathXmlApplicationContext)context).close();
		
		/*System.out.println("Id="+person.getId());
		System.out.println("name ="+person.getName());*/
		
		
	}

}
