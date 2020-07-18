package com.ashokdac.heroku.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", schema="ngf_demo")
public class Employee implements Serializable {

	private static final long serialVersionUID = -7619357044019266309L;


	@Id
	@Column(name="employee_id")
	private long employee_id;
	

	@Column(name="employee_name")
	private String employee_name;
	
	@Column(name="employee_email")
	private String employee_email;
	@Column(name="employee_address")
	private String employee_address;
	
	@Column(name="employee_salary")
	private  double employee_salary;
	
	@Column(name="employee_department")
	private String employee_department;

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_department() {
		return employee_department;
	}

	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}

	
}
