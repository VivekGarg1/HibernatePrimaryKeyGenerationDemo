package com.home.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="employee_table")
@DynamicUpdate
public class Employee {
	
	@Id 
	//GenerationType.AUTO is a default sequence generator we can achieve it with strategy or without.
		//@GeneratedValue
		//@GeneratedValue(strategy = GenerationType.AUTO)
		/*@GeneratedValue(strategy = GenerationType.AUTO,generator = "empid_generaror")
		 @SequenceGenerator(name ="empid_generaror",initialValue = 1,allocationSize = 1,sequenceName = "empid_seq" )*/
		
		//GenerationType.SEQUENCE 
		/*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empid_generaror")
		@SequenceGenerator(name ="empid_generaror",initialValue = 1,allocationSize = 1,sequenceName = "empid_seq" )*/
		
		//GenerationType.TABLE
		/*@GeneratedValue(strategy = GenerationType.TABLE,generator = "empid_generaror")
		@TableGenerator(name = "empid_generaror",table = "empid_seq")*/
		
		//GenerationType.IDENTITY 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "employee_name",length = 100, nullable = false)
	private String employeeName;
	
	@Column(name = "email",unique = true)
	private String email;
	
	@Column(name = "date_of_joining")
	private Date doj;
	
	@Column(name = "salary")
	private double salary;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
				+ doj + ", salary=" + salary + "]";
	}

}
