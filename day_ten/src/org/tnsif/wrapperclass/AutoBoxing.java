package org.tnsif.wrapperclass;
//  Program to demonstrate autoboxing
//  autoboxing = conversion of premitive to object type
public class AutoBoxing {

	public static void main(String[] args) {
		int num = 97;
		
		//converting a premitive type to object
		Integer value = num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
