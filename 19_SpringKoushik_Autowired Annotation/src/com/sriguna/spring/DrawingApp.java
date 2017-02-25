package com.sriguna.spring;

import org.springframework.context.support.AbstractApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape1 = (Shape) applicationContext.getBean("circle");
		shape1.draw();
//@Autowired annotation first will do the ByType, then it will look for ByName.. if there are more than one matching type found.. it will go by ByName
	}

}



