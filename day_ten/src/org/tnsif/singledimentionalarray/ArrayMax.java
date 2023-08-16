/* Program to demonstrate on array using runtime input values and
to find largest element in an array*/

package org.tnsif.singledimentionalarray;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no of elements of array : ");
		int n = sc.nextInt();
		
		//Array declaration
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are : ");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Maximum element of array is : " + max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are : ");
		for(int i:arr) {
			System.out.print(i + " ");
		}

	}

}
