package com.org.company.CompanyManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements java.io.Serializable{
	
	// ID, DepartmentName, Description(nullable)
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	//@Column(name="departmentname")
	private String departmentname;
	
	//@Column(name="description", nullable = true)
	private String description;
	
	public Department() {
	}

	public Department(int id,String departmentName, String description) {
		super();
		this.id = id;
		this.departmentname = departmentName;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentname;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentname = departmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
