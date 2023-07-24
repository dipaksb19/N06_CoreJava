package org.tnsif.decisionmaking;
import java.util.Scanner;
public class If_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age =sc.nextInt();
		int weight = sc.nextInt();
		if(age>18 && weight > 50) {
			System.out.println("You are eligible");
		}
		else
		{
			System.out.println("You are not eligble");
		}

	}

}
