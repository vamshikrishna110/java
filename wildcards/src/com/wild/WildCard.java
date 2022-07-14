package com.wild;

import java.util.*;

public class WildCard {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Accoutant acc = new Accoutant();
		emp = acc; //we can assign acc to emp becoz acc is an employee it means polymorphism
		//===================================================================================
		
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accoutant> accoutants = new ArrayList<>(); // it is a generic class 
		//employees = accoutants; get error // when we dealing with generics we cant assign employees to accoutants
		//Type mismatch: cannot convert from ArrayList<Accoutant> to ArrayList<Employee>
		//generics is allowed to flexible and tight saftey
		// to avoid this above error we use wild card
		employees.add(new Employee());
		accoutants.add(new Accoutant());
		
		ArrayList<?> employees2 = new ArrayList<>(); // wildcard ? it may be any datatype
		ArrayList<Accoutant> accoutants2 = new ArrayList<>();
		employees2 = accoutants2;
		
		ArrayList<? extends Employee> employees3 = new ArrayList<>(); //? is child and Employee is parent
		ArrayList<Accoutant> accoutants3 = new ArrayList<>();
		employees3 = accoutants3;
		//it is upperbound the highest type of the hireachery of object is Employee
		// and children in the hireachery is the lowest type 
		
		
		/* for the same above code of class Employee and Accoutant if we create instance in place of class 
		 * Employee emp = new Employee();
		  Accoutant acc = new Accoutant();
		  emp = acc; // it shows error becoz we cant create object for instance 
		  in interfaces generics is aalowed it wont show any error
		
		*/
		makeEmployeeWork(employees); // output Employee working
		//makeEmployeeWork(accoutants); // output accoutant working
		

		
	}
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
		
	}
	

}

class Employee {
	public void work() {
		System.out.println("Employee working");
	}
	
}
class Accoutant extends Employee {
	

	public void work() {
		System.out.println("accoutant working");
	}
	
}