package com.lab4;
abstract class ShapeEx{
	  public abstract void draw();

	  public abstract double calculateArea();
	}
class CircleEx extends Shape {
	  private double radius;

	  public CircleEx(double radius) {
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
class Cylinder extends Circle {
	  private double height;

	  public Cylinder(double radius, double height) {
	    super(radius);
	    this.height = height;
	  }

	  @Override
	  public void draw() {
	    System.out.println("Drawing a cylinder");
	  }

	  @Override
	  public double calculateArea() {
	
	    double circleArea = super.calculateArea();
	    double sideArea = 2 * Math.PI * getRadius() * height;
	    return 2 * circleArea + sideArea;
	  }

	private int getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
	}

public class CalculateEx {

	public static void main(String[] args) {
		Shape circle = new Circle(7.0);
	    Shape cylinder = new Cylinder(4.0, 9.0);

	    drawShapeAndCalculateArea(circle);
	    drawShapeAndCalculateArea(cylinder);
	  }

	  public static void drawShapeAndCalculateArea(Shape shape) {
	    shape.draw();
	    double area = shape.calculateArea();
	    System.out.println("Area: " + area);
	  }
	
	}


