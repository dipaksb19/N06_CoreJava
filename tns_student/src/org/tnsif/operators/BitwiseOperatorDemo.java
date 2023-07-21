package org.tnsif.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		System.out.println("****Bitwise Operators****");
		int x = 8;
		int y = 3;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
		//Shifting Operators
		System.out.println("Leftshift and Rightshift");
		System.out.println(8>>1);
		System.out.println(8<<1);

	}

}
