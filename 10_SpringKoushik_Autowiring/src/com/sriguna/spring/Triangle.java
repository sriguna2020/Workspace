package com.sriguna.spring;

import java.util.List;

public class Triangle {

	Point pointA;
	Point pointB;
	Point pointC;

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

}
