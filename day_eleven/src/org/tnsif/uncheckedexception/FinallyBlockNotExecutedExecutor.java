package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor {
	static void display(int arr[]) {
		try {
			System.out.println(arr[3]);
			/*If try and catch block contain a system.exit(0);
			after the exception code line, then finally block
			does not execute*/
			//System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception Handled" + e);
			//System.exit(0);
		}
		finally {
			/*when an finally block contains an exception code,
			 * then finally block does not execute*/
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		System.out.println("Any statement out of the block is always" + "executed");
	}
	
	public static void main(String[] args) {
		int arr[] = {12,6,89};
		display(arr);

	}


}
