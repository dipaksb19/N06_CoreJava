package org.tnsif.operators;
import java.util.*;
public class TerneryOperatorDemo {

	public static void main(String[] args) {
		System.out.println("****Ternery Operator****");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String result = (num % 2 == 0) ? "Even":"Odd";
		System.out.println("Result : " + result);
		sc.close();

	}

}
