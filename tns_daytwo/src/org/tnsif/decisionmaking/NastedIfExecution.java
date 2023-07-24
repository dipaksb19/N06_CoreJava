// Program to demonstarte bunji jumping

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NastedIfExecution {

	public static void main(String[] args) {
		
		System.out.println("****Bunji Jumping****");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the weight : ");
		int weight = sc.nextInt();
		if(age>12) {
			if(weight>40) {
				System.out.println("Eligible for bunji jumping");
				if(weight>110)
				{		
					System.out.println("Extra rops will added");}
				}
			else
			{
				System.out.println("Not eligible! your weight is less than 40");
			}
				
		}
		else
		{
			System.out.println("Not eligible! Your age is less than 12");
		}
		

	}

}
