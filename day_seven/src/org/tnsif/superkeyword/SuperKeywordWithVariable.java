// Program to demonstrate super keyword with variable

package org.tnsif.superkeyword;

//Parent class
class Building{
	int floors = 23;
	String name = "Ananth-Astha";
}


//child class (Extended)
class Flat extends Building{
	String name = "Dipak Bhide";
	
	void print() {
		/* if parent classs and child class variable name are same,
		 * and if you want to access parent class variable inside
		 * child class use super.variablename
		 */
		
		System.out.println(super.name);
		System.out.println(name);
	}
}  




// Main class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		System.out.println(f.name);
		f.print();

	}

}
