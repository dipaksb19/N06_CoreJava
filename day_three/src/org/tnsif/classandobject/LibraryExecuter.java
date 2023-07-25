//Driver class
// Program to demonstrate default and parameterised constructor


package org.tnsif.classandobject;

public class LibraryExecuter {

	public static void main(String[] args) {
		// object creation
		Library l = new Library();
		Library l1 = new Library(5,"Dipak Bhide","Java Programming",230.44);
		System.out.println(l1);

	}

}
