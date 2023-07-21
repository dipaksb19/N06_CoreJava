package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("****Logical Operator****");
		System.out.println(31!=7 && 3>=5);  // And Operator
		System.out.println(31!=7 || 3>=5);  // Or Operator
		System.out.println(!(31!=7 || 3>=5));  // Not operator

	}

}
