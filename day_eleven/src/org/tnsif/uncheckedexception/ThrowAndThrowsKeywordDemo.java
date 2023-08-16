package org.tnsif.uncheckedexception;
public class ThrowAndThrowsKeywordDemo {

	static void isEligible(int age, int weight) {
		if(age>18 && weight>50) {
			System.out.println("Person is eligible to donate blood");
		}
		else {
			// throw keyword is used to throw an exception explicitly
			System.out.println("Criteria is not satisfied");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			isEligible(13,55);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
