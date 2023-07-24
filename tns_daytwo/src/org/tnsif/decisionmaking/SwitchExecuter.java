
// Program to demostrate switch case 

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecuter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int songno = sc.nextInt();
		switch(songno) {
		case 1:
			System.out.println("Ready to move");
			break;
		case 2:
			System.out.println("Befikra");
			break;
		case 3:
			System.out.println("Unstoppable");
			break;
			default:
				System.out.println("Entered wrong input!");
			
		}

	}

}
