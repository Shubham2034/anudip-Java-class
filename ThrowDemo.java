package com.lab;

public class ThrowDemo {
	void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException("age is not valid");
		else 
			System.out.println("ur are eligible for voting");
	}

	public static void main(String[] args) {
		ThrowDemo td=new ThrowDemo();
      try
      {
    	  
		td.validate(13);
      }
      catch(ArithmeticException ae)
      {
    	 System.out.println("welcome for voting "); 
      }
	}

}

