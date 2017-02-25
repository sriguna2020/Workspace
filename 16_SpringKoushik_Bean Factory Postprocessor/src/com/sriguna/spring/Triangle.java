package com.sriguna.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle /*implements InitializingBean, DisposableBean*/ {

	Point pointA;
	Point pointB;
	Point pointC;
	private ApplicationContext applicationContextAware = null;

	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {

		System.out.println("Point A = " + "X : " + this.getPointA().getX() + " Y : " + this.getPointA().getY());
		System.out.println("Point B = " + "X : " + this.getPointB().getX() + " Y : " + this.getPointB().getY());
		System.out.println("Point C = " + "X : " + this.getPointC().getX() + " Y : " + this.getPointC().getY());

	}
	
	/*public void myInit(){
		//in spring.xml give init-method value which means method name which will initialize the bean..
		//in our case it its myInit()
		System.out.println("myInit method called at initialize bean");
	}

	public void myDestroy(){
		//in spring.xml give destroy-method value which means method name which will initialize the bean..
		//in our case it its myDestroy()
		// here we can give all the cleanup code required during the bean destruction
		
		System.out.println("myDestroy method called at destroy bean");
	}

	
	
	// this is the method spring will call when all ppts are set initialized.
	//this InitializingBean - is the marker for bean to know once bean are intialized call the method i.e.,afterPropertiesSet() method.
	//we can write some code which will be executed soon after bean is initialized.
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println(" InitializingBean executed after the Trianlge is set");
		
	}

	@Override
	//here as we registered the shutdownhook in main method, it will destroy all the beans once after main() got completed..
	//it will call destroy() method.. then this block of code will be executed..
	//whatever bean we have .. if we had implemented this DisposableBean.. then that appropriate bean's destroy method will be called
	//this is one of the way we can handle init and destroy
	//BUT WE HAVE BIG DISADVANTAGE WITH THIS AS WELL.. 
	//we use the spring specific interfaces - InitializingBean, DisposableBean 
	//We cannot change the logic without code..
	public void destroy() throws Exception {

		System.out.println("Disposable bean executed for destroy");
		
	}
*/

}
