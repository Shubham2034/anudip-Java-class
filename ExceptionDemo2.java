package com.lab;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int a = 30, b =0;
		try
		
		{
			int c = a/b;
		
		System.out.println ("Result = "+ c);

		}
		catch(NumberFormatException arb)
		{
			System.out.println("Searching a number of divide number");
		}

}
}