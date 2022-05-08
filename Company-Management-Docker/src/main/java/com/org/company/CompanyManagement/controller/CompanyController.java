package com.org.company.CompanyManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.company.CompanyManagement.model.Department;
import com.org.company.CompanyManagement.model.Resource;
import com.org.company.CompanyManagement.service.DepartmentService;
import com.org.company.CompanyManagement.service.ResourceService;

@RestController
@RequestMapping("company")
//Got issue by url at controller level. So updated with @RequestMapping
public class CompanyController {
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	ResourceService resourceService;
	
	@GetMapping("/hi")
	public String firstservice() {
		return "HI";
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/departments/department")
	public Department getDepartmentByName(@RequestParam String departmentname) {
		return departmentService.getDepartmentByName(departmentname);
	}
	
	
	public List<Resource> getAllResources(){
		return resourceService.getAllResources();
	}

}
