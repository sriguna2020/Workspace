package com.spring.sriguna;

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

	public void draw(){
		System.out.println("Triangle drawn is "+" A : "+this.getPointA().getX()+" , "+this.getPointA().getY());
		System.out.println("Triangle drawn is "+" B : "+this.getPointB().getX()+" , "+this.getPointB().getY());
		System.out.println("Triangle drawn is "+" C : "+this.getPointC().getX()+" , "+this.getPointC().getY());
	}
	
}
