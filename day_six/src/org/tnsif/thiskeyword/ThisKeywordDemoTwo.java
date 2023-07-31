//

package org.tnsif.thiskeyword;


class Bank{
	long accountNo;
	Bank(long accountNo){
		this.accountNo = accountNo;
			
		
	}
	
	void display() {
		System.out.println(accountNo);
	}
}

public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		Bank b = new Bank(1234235);
		b.display();

	}

}
