package com.sriguna.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));//supplying the xml file to spring for bean definition.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");//we dont need to send new filesystem resource with this classpathxmlappcontext.
		Triangle triangle = (Triangle) applicationContext.getBean("alias-triangle");
		triangle.draw();

	
	
	}

}
