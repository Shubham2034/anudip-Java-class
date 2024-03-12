package com.lab;

 class ShapeEx1 
 {
             double getArea()
             {
            	 return 0;
             }
             
 }
 class Rectangle extends ShapeEx1
 {
	 double length;
	 double width;	 
	 
	 Rectangle(double length,double width)
	 {
		 this.length=length;
		 this.width=width;
	 }
	 double getArea()
	 {
		 return length*width;
	 }
 }
 public class ShapeEx{
	 
	public static void main(String[] args) {
Rectangle r=new Rectangle(7,12);
		
		double area= r.getArea();
		
		System.out.println("Area of Rectangle:"+ area);
		


	}

}
