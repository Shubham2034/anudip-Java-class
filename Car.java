package com.corejava;
class Vehicale
{
	String brand="Maruti";
	public void honk()
	{
		System.out.println("beep beep!....");
	}
}
public class Car extends Vehicale {
	String  modelName="Maruti800";

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.honk();
		System.out.println(myCar.brand +" "+ myCar.modelName);
	}

	public void drive() {
	
		
	}

}
