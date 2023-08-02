package org.tnsif.superkeyword;

//parent class
class MET{
	String ownerName = "Chhagan Bhujbal";
	void displayName() {
		System.out.println("Owner of Met is : " + ownerName);
	}
}


class BKC extends MET{
	String ownerName = "Shefali Bhujbal";
	void displayName() {
		/* if Parent class and Child class name is same,
		 * and if you want to access that method inside
		 * child class, then use
		 * super.methodname
		 */
		
		super.displayName();
		System.out.println("Owner of BKC is : " + ownerName);
		
	}
}


public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC o = new BKC();
		o.displayName();

	}

}
