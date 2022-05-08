package com.org.company.CompanyManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.company.CompanyManagement.model.Department;
import com.org.company.CompanyManagement.repository.DepartmentDAO;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDAO departmentDAO;

	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentDAO.findAll();
	}

	
	public Department getDepartmentByName(String departmentname) {
		// TODO Auto-generated method stub
		return departmentDAO.findByDepartmentname(departmentname);
	}
	


}
