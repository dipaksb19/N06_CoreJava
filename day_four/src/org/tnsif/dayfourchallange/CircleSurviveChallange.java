/*
 * There are N peoples standing in a circle waiting to be executed.
 * the counting out begains at some point in the circle 
 * and proceeds around the circle in a fix direction.
 * in each state a certain number of peoples are skippe and the next person executed.
 * The elimination proceeds around the circle in the ( which is becoming smaller and smaller
 * as executed people are removed )
 * until only the last person remains, who is given freedom.
 * Given - total number of person n and number k which indicate that the k-1 person skipped
 * and kth person is killed in a circle
 * the task is to choos the person in the initial circle that survive
 */

package org.tnsif.dayfourchallange;

import java.util.Scanner;

public class CircleSurviveChallange {
	
	static int survive(int n, int k) {
		if(n == 1) {
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;
		}
	}

	public static void main(String[] args) {
		System.out.println("\t\t****Solving Problems*****");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of K : ");
		int k = sc.nextInt();
		
		System.out.println("Enter the no of peoples : ");
		int n = sc.nextInt();
		
		System.out.println(survive(n,k));
		
		
		
		
		

	}

}
