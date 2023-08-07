//Program to demonstrate on interface

package org.tnsif.interfaceexecuter;

public interface Sony {
	/*by default all the variables inside an interface is 
	public static final*/
	int noofChannes = 8;
	
	
	//This is abstract method
	//by default all methods inside an interface is an abstract method
	void display();
	

	
	
	/*Java 8 provides an static and default method inside an interface*/
	//static method
	static void accept() {
		System.out.println("Static Method");
	}
	
	
	//default method
	default void show() {
		System.out.println("Default Method");
	}

}
