//Program to demonstrate on single or 1D array using compile time input

package org.tnsif.singledimentionalarray;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[] = {66,33,21,6,1};
		System.out.println("Element of array index 1 : " + arr[1]);
		System.out.println("Array elements are : ");
		
		//enhance for loop
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr2[];

	}

}
