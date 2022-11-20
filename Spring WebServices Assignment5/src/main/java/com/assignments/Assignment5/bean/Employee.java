package com.assignments.Assignment5.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private String dept;
	private String desgn;
	private double salary;
	
	public Employee() {
		super();	
	}
	
	public Employee(int id, String name, String dept, String desgn, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desgn = desgn;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desgn=" + desgn + ", salary=" + salary
				+ "]";
	}
	
	

}
