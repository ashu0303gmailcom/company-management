package com.org.company.CompanyManagement.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.company.CompanyManagement.model.Department;

@Repository	
public interface DepartmentDAO extends JpaRepository<Department, Id>{

	Department findByDepartmentname(String departmentname);

}
