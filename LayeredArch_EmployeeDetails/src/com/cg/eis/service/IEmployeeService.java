package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
     public abstract void addEmployee(Employee employee);

	public abstract Employee findScheme(float salary, String designation);
}
