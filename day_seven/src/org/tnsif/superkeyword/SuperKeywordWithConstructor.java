package org.tnsif.superkeyword;

//Program to demostrate on super constructor
//Parent class
class Google{
	String ceo;

	public Google(String ceo) {
		System.out.println("Default Constructor : " + ceo);
	}
	
	
}

//child class
class Gmail extends Google{
	String userid;

	public Gmail(String ceo, String userid) {
		//calling to parant class parameterised constructor
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail o = new Gmail("Sundar Pichai","abd@gmail.com");

	}

}
