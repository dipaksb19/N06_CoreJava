//Program to demonstrate on custom exception
/*to use custom exception extend an exception class(parent)*/

package org.tnsif.customexception;

public class Logincredentatial extends Exception{
	private String str;
	
	//getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public Logincredentatial(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	
	
}