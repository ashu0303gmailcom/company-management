package com.org.company.CompanyManagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resource {
	
	 //ID, Name, DOB(nullable), IsManager
	@Id
	@GeneratedValue
	private int id;

	private String name;
	
	private Date dob;
	
	// todo - Add validation to accept 1 or 0 as input
	private int isManager;
	
	private int departmentId;
	
	public Resource() {
	}

	public Resource(String name, Date dob, int isManager) {
		super();
		this.name = name;
		this.dob = dob;
		this.isManager = isManager;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getIsManager() {
		return isManager;
	}

	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

}
