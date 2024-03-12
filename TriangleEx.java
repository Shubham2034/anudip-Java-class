package com.lab4;
abstract class Shape {
	  public abstract void draw();

	  public abstract double calculateArea();
	}
class Circle extends Shape {
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
	}
class Square extends Shape {
	  private double side;

	  public Square(double side) {
	    this.side = side;
	  }

	  @Override
	  public void draw() {
	    System.out.println("Drawing a square");
	  }

	  @Override
	  public double calculateArea() {
	    return side * side;
	  }
	}
class Triangle extends Shape {
	  private double base;
	  private double height;

	  public Triangle(double base, double height) {
	    this.base = base;
	    this.height = height;
	  }

	  @Override
	  public void draw() {
	    System.out.println("Drawing a triangle");
	  }

	  @Override
	  public double calculateArea() {
	    return 0.5 * base * height;
	  }
	}

public class TriangleEx {

	public static void main(String[] args) {
		Shape circle = new Circle(7.0);
	    Shape square = new Square(12.0);
	    Shape triangle = new Triangle(5.0, 3.0);

	    drawShapeAndCalculateArea(circle);
	    drawShapeAndCalculateArea(square);
	    drawShapeAndCalculateArea(triangle);
	  }

	  public static void drawShapeAndCalculateArea(Shape shape) {
	    shape.draw();
	    double area = shape.calculateArea();
	    System.out.println("Area: " + area);
	  }
	

	}


