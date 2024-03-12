package com.corejava;

public class OprationPraogram {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int c=5;
		int result=a+b;
		//Arithmetic Operator
		System.out.println("a + b = " + result);
		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
		
		
		// Relatinonal operator
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		
		
		// bitwise operator
		/*
		 * Java defines several bitwise operators, 
		 * which can be applied to the integer types, long, int, 
		 * short, char, and byte.
Bitwise operator works on bits and performs bit-by-bit operation
		 */
		int m=60; // 0011 1100
				//	 128 64 32 16  8 4 2 1
				//   0	 0	1   1  1 1 0 0	=60 
		int n=13; // 0   0  0  0   1 1 0 1  =13
		// a&b = 0000 1100 = 12
		/*
		 * a|b = 0011 1101 =61 
		   a^b = 0011 0001 =49 
           ~a  = 1100 0011 =

		 */
		
		result=m & n;
		System.out.println(result);
		
		result=m | n;
		System.out.println(result);
		
		result=m ^ n;
		System.out.println(result);
		
		result=m & n;
		System.out.println(result);
		
		result=m >> 2; // 15
		System.out.println("m >> 2" + result);
		
		result=m << 2; // 15
		System.out.println("m << 2" + result);
		
		// Ternary Operator
		int min=(a<b)? a : b;
		System.out.println(min);
		
		
		// assignemnt/complex operator
		
		System.out.println("a=a+b " + (a +=b)); 
		System.out.println("a=a-b " + (a -=b)); 
		System.out.println("a=a*b " + (a *=b)); 
		System.out.println("a=a/b " + (a /=b)); 
		
		
		// increment and decrement operators
		
		int x=5;
		int z=10;
		
		System.out.println(x);
		System.out.println(x++); 
		System.out.println(x--);
		
		//preincrement and post increment
		
		System.out.println(++x); 
		System.out.println(x++); 
		
		
	}
	
	

}


