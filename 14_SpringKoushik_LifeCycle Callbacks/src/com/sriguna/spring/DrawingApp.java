package com.sriguna.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext applicationContext;

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();//this method will be used to tell spring to automatically close the context when main() ends and destroy all the beans 
		// which means to automatically call destroy() for all the beans. By this way we can configure destroy()
		Triangle triangle = (Triangle) applicationContext.getBean("triangle1");
		triangle.draw();

	
	
	}

}



//Output:-

/*Jan 16, 2017 12:00:53 PM org.springframework.context.support.ClassPathXmlApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@18e6db6: startup date [Mon Jan 16 12:00:52 IST 2017]; root of context hierarchy
Jan 16, 2017 12:00:53 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring.xml]
 InitializingBean executed after the Trianlge is set
myInit method called at initialize bean
Point A = X : -20 Y : 0
Point B = X : -20 Y : 0
Point C = X : 20 Y : 0
Jan 16, 2017 12:00:53 PM org.springframework.context.support.ClassPathXmlApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@18e6db6: startup date [Mon Jan 16 12:00:52 IST 2017]; root of context hierarchy
Disposable bean executed for destroy
myDestroy method called at destroy bean*/