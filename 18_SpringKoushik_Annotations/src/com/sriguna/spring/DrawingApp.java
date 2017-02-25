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
		//when we give ID of Triangle it will call Triangle's draw() 
		
		Shape shape = (Shape) applicationContext.getBean("triangle1");
		shape.draw();
		
		//when we give ID of Circle it will call Triangle's draw() 
		Shape shape1 = (Shape) applicationContext.getBean("circle");
		shape1.draw();

		// we can add any no. of new classes implementing the Shape inteface
		//DrawingApp will fully unaware of when the new class is added..
		// what it contains.. we can also create new shapes like Rectangle, Square, etc.,
	
	}

}



//Output:-

/*Jan 16, 2017 7:38:54 PM org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@18e6db6: startup date [Mon Jan 16 19:38:54 IST 2017]; root of context hierarchy
Jan 16, 2017 7:38:54 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring.xml]
Jan 16, 2017 7:38:54 PM org.springframework.beans.factory.config.PropertyPlaceholderConfigurer loadProperties
INFO: Loading properties file from class path resource [pointsConfig.properties]
My bean factory post processor is called
Drawing Triangle 
Point A = X : 0 Y : 0
Point B = X : -20 Y : 0
Point C = X : 20 Y : 0
Drawing circle 
Circle point is : (0, 0)
*/