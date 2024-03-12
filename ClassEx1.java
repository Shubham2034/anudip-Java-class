package com.corejava;

public class ClassEx1 {
		 
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  
		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }

		  public static void main(String[] args) {
		    ClassEx1 myCar = new ClassEx1();     
		    myCar.fullThrottle();      
		    myCar.speed(200);          
		  }
		




	}


