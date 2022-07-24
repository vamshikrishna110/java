package com.cg.eis.bean;

public class Employee {

	private int empId;
	private String empName;
	private float empSalary;	
	private String empDesignation;
	private String empInsuranceScheme;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpInsuranceScheme() {
		return empInsuranceScheme;
	}
	public void setEmpInsuranceScheme(String empInsuranceScheme) {
		this.empInsuranceScheme = empInsuranceScheme;
	}
	
	public Employee() {
		super();
	}

	
	public Employee(int empId, String empName, float empSalary, String empDesignation, String empInsuranceScheme) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.empInsuranceScheme = empInsuranceScheme;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesignation="
				+ empDesignation + ", empInsuranceScheme=" + empInsuranceScheme + "]";
	}
	
}
