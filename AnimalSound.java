package com.lab;

 class AnimalSound1
 {
	 
	 void makeSound()
	 {
		  System.out.println("Making a sound");
	 }
 }
 class Cat extends AnimalSound1
 {
	 void makeSound()
	 {
		 System.out.println("Cat be like : Mewo Mewo...!!");
	 }
 }
 
public class AnimalSound{
	
public static void main(String[] args) {
		AnimalSound1 a= new AnimalSound1();
		a.makeSound();
		
		Cat c= new Cat();
		c.makeSound();

	
		
	
	}

}
