package com.lab;
     abstract class Lab2{
	public abstract void draw();
	public abstract double calculateArea();
}
abstract class Circle6 extends Shape{
	abstract class Circle extends Shape {
		  private double radius;

		  public Circle(double radius) {
		    this.radius = radius;
		  }

		  @Override
		  public void draw() {
		    System.out.println("Drawing a circle");
		  }

		  @Override
		  public double calculateArea() {
		    return Math.PI * radius * radius;
		  }

		  protected double getRadius() {
		    return radius;
		  }
		}
class Cylinder extends Circle6 {
	  private double height;

	  public Cylinder(double radius, double height) {
	    super();
	    this.height = height;
	  }

	  @Override
	  public void draw() {
	    System.out.println("Drawing a cylinder");
	  }

	  @Override
	  public double calculateArea() {
	    // Calculate the total surface area of the cylinder (including the circular top and bottom)
	    double circleArea = super.calculateArea();
	    double sideArea = 2 * Math.PI * getRadius() * height;
	    return 2 * circleArea + sideArea;
	  }

public class SurfaceArea {
	  public void main(String[] args) {
	    Shape circle = new CircleEx();
	    Cylinder cylinder = new Cylinder(4.0, 9.0);

	    drawShapeAndCalculateArea(circle);
	    drawShapeAndCalculateArea(cylinder);
	  }

	  private void drawShapeAndCalculateArea(Shape circle) {
		
	}

	public void drawShapeAndCalculateArea(Cylinder cylinder) {
	    cylinder.draw();
	    double area = cylinder.calculateArea();
	    System.out.println("Area: " + area);
	  }
	}
}
protected abstract int getRadius();}

	  