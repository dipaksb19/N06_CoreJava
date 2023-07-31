// Demonstrating the use of this keyword

package org.tnsif.thiskeyword;


class Director{
	String name;
	void print() {
		this.name = "Siddharth Anand";
		display(name);
	}
	void display(String name) {
		System.out.println("Director name is : " + name);
	}
}



public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();

	}

}
