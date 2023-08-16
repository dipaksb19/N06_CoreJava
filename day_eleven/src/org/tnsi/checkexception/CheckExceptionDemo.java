//Program to demonstrate on check exception

package org.tnsi.checkexception;
import java.io.FileInputStream;
public class CheckExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\tnsif");
			System.out.println("File is exists!!");
		}
		catch(Exception e) {
			System.out.println("Exception Handled : " + e);
		}
	}

}
