package org.tnsif.uncheckedexception;
// Program to demonstrate on catch block with multiple exception class
public class CatchBlockDemo {
	void print(int arr[]) {
		try {
			System.out.println(arr[3]);
		}
		// we can use multiple catch block inprogram
		catch(ArithmeticException  | NullPointerException e){
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {12,3,14};
	}

}
