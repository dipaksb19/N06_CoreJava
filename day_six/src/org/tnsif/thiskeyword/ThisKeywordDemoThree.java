// Program todemostrate this keyword with parameterised and default constructor


package org.tnsif.thiskeyword;


class Team{
	int size;
	Team(){
		// Calling Parameterised
		this(7);
		System.out.println("Default Constructor");
	}
	
	Team(int size){
		System.out.println("Parameterised Constructor : " + size);
	}
}


public class ThisKeywordDemoThree {

	public static void main(String[] args) {
		Team t = new Team();

	}

}
