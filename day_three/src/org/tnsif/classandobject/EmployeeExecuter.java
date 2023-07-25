// Driver class
// Program to demonstrate class and object

package org.tnsif.classandobject;

public class EmployeeExecuter {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empid = 12345;
		e.empName = "Mayur Dehade";
		e.salary = 100000;
		e.department = "IT";
		
		e.display();

	}

}
