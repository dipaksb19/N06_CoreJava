package org.tnsif.operators;
import java.util.*;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		System.out.println("\t\t******Operators*****\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers : \n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Substraction : " + (num1 - num2));
		System.out.println("Multiplication : " + (num1 * num2));
		System.out.println("Division : " + (num1 / num2));
		System.out.println("Modulus : "+ (num1 % num2));
		
	}

}
