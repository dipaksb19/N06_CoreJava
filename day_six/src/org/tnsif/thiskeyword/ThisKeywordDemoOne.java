// Program to demonstrate on
// This keyword is used to refer current instance of the class
package org.tnsif.thiskeyword;

class Account{
	long accountNo;
	void setData(long accountNo) {
		this.accountNo = accountNo;
	}
	
	void display() {
		System.out.println(accountNo);
	}
}


public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(41010310000123L);
		a.display();

	}

}
