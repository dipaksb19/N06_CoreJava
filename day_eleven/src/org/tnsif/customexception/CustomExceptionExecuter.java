package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args) throws Logincredentatial{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mail id and password: ");
		String userid = s.nextLine();
		String password = s.nextLine();
		
		try {
		if(userid.equals("dbhide0@gmail.com") && (password.equals("Pass@123")))
			System.out.println("Credentials are matched!!!");
		else
			throw new Logincredentatial("Invalid Credentials");
		}
		catch(Logincredentatial e) {
			System.out.println("Exception handled: "+e);
		}
	}

}