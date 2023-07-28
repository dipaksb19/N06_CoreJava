
// 
package org.tnsif.encapsulation;

public class EncapsulationExecuter {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		
		// Setting value to private data member
		h.setAccType("Saving Account");
		h.setAccountNo(1326734378642L);
		h.setAtmCardNo(12345678L);
		h.setPinNo(1234);
		
		
		//System.out.println("Account No. is : " + h.getAccountNo());
		//Below line will call to toString() method
		System.out.println(h);
		

	}

}
