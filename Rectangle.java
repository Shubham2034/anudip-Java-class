package com.corejava;

public class Rectangle {
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }

    
    public double getHeight() {
        return height;
    }

    
    public void setHeight(double height) {
        this.height = height;
    }

    
    public double calculateArea() {
        return width * height;
    }

    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        
        System.out.println("Width of the rectangle: " + rectangle.getWidth());
        System.out.println("Height of the rectangle: " + rectangle.getHeight());

        
        rectangle.setWidth(8.0);
        rectangle.setHeight(10.0);
        System.out.println("Modified width of the rectangle: " + rectangle.getWidth());
        System.out.println("Modified height of the rectangle: " + rectangle.getHeight());

        
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }


	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
