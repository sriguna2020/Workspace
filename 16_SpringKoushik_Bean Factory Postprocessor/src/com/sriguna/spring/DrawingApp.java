package com.sriguna.spring;

import org.springframework.context.support.AbstractApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext applicationContext;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		// which means to automatically call destroy() for all the beans. By this way we can configure destroy()
		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		triangle.draw();

	
	
	}

}



//Output:-

/*Jan 16, 2017 6:18:57 PM org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@18e6db6: startup date [Mon Jan 16 18:18:57 IST 2017]; root of context hierarchy
Jan 16, 2017 6:18:57 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring.xml]
Jan 16, 2017 6:18:57 PM org.springframework.beans.factory.config.PropertyPlaceholderConfigurer loadProperties

//HERE SPRING LOADS THE PROPERTIES FILE MENTIONED
INFO: Loading properties file from class path resource [pointsConfig.properties]

My bean factory post processor is called
Point A = X : 0 Y : 0
Point B = X : -20 Y : 0
Point C = X : 20 Y : 0
*/