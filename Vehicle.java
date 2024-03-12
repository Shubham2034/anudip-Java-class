package com.corejava;

//Vehicle class
class Vehicle {
 public void drive() {
     System.out.println("Driving a vehicle");
 }
}

//Car class, subclass of Vehicle
class Car1  extends Vehicle {
 // Overrides the drive() method from the Vehicle class
 @Override
 public void drive() {
     System.out.println("Repairing a car");
 }


//Main class

 public static void main(String[] args) {
     // Creating an instance of Car
     Car myCar = new Car();
     // Calling the drive method
     myCar.drive();
 }
}
