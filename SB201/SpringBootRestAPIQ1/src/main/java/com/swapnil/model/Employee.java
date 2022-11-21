package com.swapnil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;

	private String empName;
	private Integer salary;
	private String address;
	@Email(message = "Enter the correct mail")
	private String email;
	@Size(min=9 ,max = 10 ,message = "mobile should be in 10 digit")
	private String mobile;
	@Size(min = 3 ,max = 10,message = "length should be between 3 to 8")
	private String password;
	
	
	
	
	public Employee() {
		super();
	}
	
	
	
	
	public Employee(Integer empId, @Min(value = 3, message = "name length should not be less than 3") String empName,
			Integer salary, String address, @Email(message = "Enter the correct mail") String email,
			@Size(min = 10, max = 10, message = "Enter 10 digit number") String mobile,
			@Size(min = 3, max = 8, message = "enter the correct password should be in between 3 to 8") String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}




	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", email=" + email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	
}
