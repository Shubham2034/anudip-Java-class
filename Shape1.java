package com.lab;


	 abstract class Area {
		   void draw() {
			// TODO Auto-generated method stub
			
		}

		   abstract double calculateArea();
		}

		//Circle.java

		class Circle extends Area {
		  private double radius;

		  public Circle(double radius) {
		    this.radius = radius;
		  }

		  public void draw() {
		    System.out.println("Drawing a circle");
		  }

		  @Override
		  public double calculateArea() {
		    return Math.PI * radius * radius;
		  }
		}
		//Square.java

		class Square extends Area {
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
		//Triangle.java
		class Triangle extends Area {
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
		public class Shape1{
			 private static Area area;

			public static void main(String[] args) {
				    Area circle = new Circle(7.0);
				    Area square = new Square(12.0);
				    Area triangle = new Triangle(5.0, 3.0);

				    drawShapeAndCalculateArea(circle);
				    drawShapeAndCalculateArea(square);
				    drawShapeAndCalculateArea(triangle);
				  }

				  private static void drawShapeAndCalculateArea(Area circle) {
				// TODO Auto-generated method stub
				
			}

				public static void drawShapeAndCalculateArea(Shape shape) {
				    area.draw();
				    double area = shape.calculateArea();
				    System.out.println("Area: " + area);
			

				  }
}
