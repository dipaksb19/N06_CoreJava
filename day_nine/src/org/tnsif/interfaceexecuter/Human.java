package org.tnsif.interfaceexecuter;

public class Human implements ColdDrink, AlcoholDrinks {

	@Override
	public void showdrink() {
		System.out.println(colddrinkName + " " + alcoholType + " " + Brand);
		
	}

}
