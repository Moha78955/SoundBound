package com.belhaim.demo.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false,updatable=false)
	private Long id;
	private String name;
	public String email;
	
	private	String jobTitle;
	private String phone;
	private String imageUrl;
	@Column(nullable=false,updatable=false)
	private String employeeCode;
	public Employee() {
		
	}
	public Employee(String name, String jobTitle, String phone, String imageUrl, String employeeCode) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.employeeCode = employeeCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	@Override
	public String toString() {
		return "Employee{"+
				"id= "+id+
				",name='"+name+'\''+
				",email='"+email+'\''+
				",phone='"+phone+'\''+
				",JobTitle='"+jobTitle+'\''+
				",imageurl='"+imageUrl+'\''+'}';
	}
	
	
	
	

}
