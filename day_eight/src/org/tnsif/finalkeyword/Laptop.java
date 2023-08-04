package org.tnsif.finalkeyword;
//Program to demonstrate on final method
//Parent class

// Final class canot be inherit from child class
//public class final laptop
public class Laptop {

	final String processor = "Intel i3";
	
	//final method
	final void display() {
		System.out.println(processor);
	}
}
