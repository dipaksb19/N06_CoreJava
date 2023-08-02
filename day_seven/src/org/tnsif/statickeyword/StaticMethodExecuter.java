// Program to demonstrate on static method
package org.tnsif.statickeyword;

public class StaticMethodExecuter {

	String str = "BKC";
	static float percentage = 25.00f;
	// Static Methos
	/* if any method outside the main function and if you want to 
	 * access that method inside the main function, make it
	 * as static
	 */
	static void displayScore(int score) {
		System.out.println("percentage : " + percentage);
		/* we cant use non static variable inside static method*/
	    //System.out.println(str);
		System.out.println("Score value : " + score);
		
	}
	
	public static void main(String[] args) {
		displayScore(54);

	}

}
