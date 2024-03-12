package com.lab;

   class AnimalEx1 {
	void  move()
	{
		 System.out.println("Running");
		 
	}
}
class Cheetah extends AnimalEx1

{
	void move()
	{
		System.out.println("Running through a hell.....!!");
		
	}
}
public class AnimalEx{
	public static void main(String[] args) {
		AnimalEx1 a = new AnimalEx1();
		a.move();
		Cheetah c = new Cheetah();
		c.move();
	}

}
