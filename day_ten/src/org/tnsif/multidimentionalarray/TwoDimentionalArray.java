//Program to demonstrate on multidimentional(2D array) array

package org.tnsif.multidimentionalarray;
import java.util.Scanner;


public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2D array declaration
		int arr[][] = new int[3][2];
		
		//Entering elements in the array 
		System.out.println("Enter the elements of Array : ");
		for (int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//displaying the entered elements of the array
		System.out.println("Entered elements are : ");
		for (int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
