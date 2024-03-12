package com.lab;

import java.io.IOException;

public class ThrowDemo1 {
	
	void method1() throws IOException
	{
		throw new IOException("Some hardware problem");
	}
	void method2() throws IOException
	{
		method1();
	}
	void method3()
	{
		try {
			method2();
		}catch(IOException e) {
			System.out.println("In method 3 exception");
		}
	}

	public static void main(String[] args) {
		ThrowsDemo1 td=new ThrowsDemo1();
		td.method3();
		System.out.println("bacha Hua code excute hoga");

	}

}
