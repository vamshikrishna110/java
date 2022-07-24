package com.cg.eis.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	
	static Map <Integer,Employee> employeeList = new HashMap();

	@Override
	public void addEmployee(Employee employee) {
		
	employeeList.put(employee.getEmpId(),employee);
	System.out.println(employee);
	}

	@Override
	public Employee findScheme(float salary, String designation) {
		for (Entry <Integer,Employee> employee:employeeList.entrySet()) {
			if((employee.getValue().getEmpSalary() == salary) && (employee.getValue().getEmpDesignation().equals(designation))) {
				return employee.getValue();
			}
		}
		
		return null;
	}
	
}
