package com.sriguna.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	//this 'center' member var is must to be initialized in xml
	//if not configured in xml.. then we need to tell spring to validate if its configured or not
	//@Required will do this work. We add this annotation to check if this setter is executed or not.
	//Also we need to have BeanPostProcessor
	//org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'circle' defined in class path resource [spring.xml]: Initialization of bean failed; nested exception is org.springframework.beans.factory.BeanInitializationException: Property 'center' is required for bean 'circle'
	//at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:547) -
	//This will be thrown while at the time of application intialization itself
	//Instead of RunTimeException throwing NullPointerException
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {

		System.out.println("Drawing circle ");
		System.out.println("Circle point is : ("+ center.getX()+", "+center.getY()+")");
		
	}

}
