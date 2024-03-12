package com.corejava;

	public class Circle {
	    private double radius;
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	   
	    public double getRadius() {
	        return radius;
	    }

	   
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	   
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	        
	        Circle circle = new Circle(5.0);

	       
	        System.out.println("Radius of the circle: " + circle.getRadius());

	       
	        circle.setRadius(7.0);
	        System.out.println("Modified radius of the circle: " + circle.getRadius());

	        
	        System.out.println("Area of the circle: " + circle.calculateArea());

	        
	        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
	    }
	}
