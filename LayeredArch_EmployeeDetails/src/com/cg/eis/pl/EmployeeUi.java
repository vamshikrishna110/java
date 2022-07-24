package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;


public class EmployeeUi {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome Employee ");
		
		while(true) {
			System.out.println("choose what u want to do....");
			System.out.println(" option 1. add employee \n option2. get insurance scheme \n option3.get all  \n option4.  delete  \n option5. getById");
			System.out.println("Enter OPTIONS between 1 to 5 only");
			
			int opt=scan.nextInt();//expecting input mismatch exception
		switch(opt){
		
		case 1:
			addEmployee();
			System.out.println("Employee has been added successfully!!!");
			break;
		case 2:
			getInsuranceScheme();
			//System.out.println("");
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			System.exit(0);
			break;
			
			default:
				break;
		}
		}
	}
	
	private static void getInsuranceScheme() {
		System.out.println("enter salary of the employee");
		float salary=scan.nextFloat();
		
		System.out.println("enter designation of the employee");
		String designation=scan.next();
		
		IEmployeeService iEmployeeService=null;
		iEmployeeService=new EmployeeServiceImpl();
		Employee employee = iEmployeeService.findScheme(salary,designation);
		System.out.println(employee.getEmpInsuranceScheme());
	}
	
	static  Employee getInputForEmployee(){
		System.out.println("enter id of the employee");
		int id=scan.nextInt();
		
		System.out.println("enter name of the employee");
		String name=scan.next();
		
		System.out.println("enter salary of the employee");
		float salary=scan.nextFloat();
		
		System.out.println("enter designation of the employee");
		String designation=scan.next();
		
		System.out.println("enter insuranceScheme of the employee");
		String insuranceScheme=scan.next();
		
		Employee employee=new Employee(id,name, salary, designation, insuranceScheme);
		return employee;
	}
	
	private static void addEmployee(){
		Employee employee =getInputForEmployee();//obj still needs id
		IEmployeeService iEmployeeService=null;
		iEmployeeService=new EmployeeServiceImpl();
		iEmployeeService.addEmployee(employee);
		
	}
	
}
