package com.Lab5;
//Interfaces, another way of implementing abstraction in java.
//all the interface in java are by default abstract
// by default all the method in interfaces are abstract
// interface should have all abstract method
//all the method  and in interface are pure absract method no choncrate method 
//After 1.8 you can add conctrate method in interface but they must be declare
//the abstract in the interface in can not be private
//by default create object of the interface
//you cannot create a object o
  interface InterfaceSample
{  
	  int i=-0;
	 void display();
      void show();
	
	
}
class ABC implements InterfaceSample {

	@Override
	public void display() {
		
//		System.out.println(i++);
		
	}

	@Override
	public  void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		InterfaceSample i=new InterfaceSample();// cannot 
		
	}

}
