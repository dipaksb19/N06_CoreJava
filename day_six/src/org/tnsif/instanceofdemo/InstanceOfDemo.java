package org.tnsif.instanceofdemo;


class RBI{
	protected String ifscCode = "RBISONGPA01";
}

class SBI extends RBI{
	public SBI() {
		super.ifscCode = "RBISONGPA01";
		String ifscCode = "SBIN02161";
		System.out.println(ifscCode);
		/* if patrent class and child class variable name are same,
		 * in such case, use super.variablename to access that
		 * variable of parent class inside the child class
		 */
		System.out.println(super.ifscCode);
	}
	 
}

class HDFC extends SBI{
	String ifscCode = "HDFC000123";
	
}



//Instance of Operator
public class InstanceOfDemo {
	

	public static void main(String[] args) {
		SBI s =  new SBI();
		System.out.println(s instanceof RBI);
		System.out.println(s instanceof SBI);

	}

}


/*
 *         ****ses of This Keyword**** 
 *         
 * it can used to refer instannce variable of current class
 */
