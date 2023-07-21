package org.tnsif.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		System.out.println("****Increment and Decrement Operator****");
		int x =23;
		int y = 6;
		System.out.println("Increment");
		int res1= x++ + ++y; //23 + 7
		System.out.println(res1);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Decrement");
		int res2= x-- + --y; // 24 + 6 //30
		System.out.println("Result : " + res2);
		System.out.println(x);
		System.out.println(y);
		
	}

}
