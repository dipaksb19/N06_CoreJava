// Program to demonstrate on static block

package org.tnsif.statickeyword;

public class StaticBlockExecuter {
	String str;
	static float salary;
	
	/* static bloc is used to initialize static variable 
	 * and we cant initialize any non static variable inside
	 * the static block*/
	
	
	static {
		salary = 1738371.23f;
		//str = "BKC";
		System.out.println(salary);
	}
	static void print() {
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {
		/* Main function is static and hence it calls static block
		method and variable by default */
		print();

	}

}
