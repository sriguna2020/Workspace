package com.sriguna.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	
	@Resource(name="pointC")//it will look for bean with name pointC, if name not mentioned it will look for
	//one with var name.. i.e., center
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {

		System.out.println("Drawing circle ");
		System.out.println("Circle point is : ("+ center.getX()+", "+center.getY()+")");
		
	}

	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy of circle");
	}
}
