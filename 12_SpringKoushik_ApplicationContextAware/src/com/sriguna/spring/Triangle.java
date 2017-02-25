package com.sriguna.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

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

	//below setters will be executed before code starts execution i.e., just after beans loaded..
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {

		this.applicationContextAware = context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is " + beanName);

	}

}
