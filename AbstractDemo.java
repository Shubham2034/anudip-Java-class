package com.lab;

abstract class Animal3
{
     abstract void soundAnimal();//Abstrct method
      void display()//concrate Method
      {
    	  
      }
      void show()
      {
    	  
      }
      abstract void abc();
      
      {
    	  
      }
}
class paret extends Animal3{
	@Override
	
	void soundAnimal() {
		System.out.println("Maooww.....")	;
		}

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

	
}
class Cow extends Animal3{
	@Override
	
	void soundAnimal() {
		System.out.println("Hammm....")	;
		}

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// you can not create object of a class
		//Animal3 animal =new Animal3();
		Animal3 animal3;
		paret cat = new paret();
		Animal3 animal =animal3;
		//Conctrete class object is auto 

	}

}
s
