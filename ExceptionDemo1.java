package com.lab;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		
	{ int i=arr[4];
        System.out.println("muzhe execute hona hai");
	}
		catch(ArrayIndexOutOfBoundsException arb)
		{
			System.out.println("searching number is greater that the define range");
		}

}
}