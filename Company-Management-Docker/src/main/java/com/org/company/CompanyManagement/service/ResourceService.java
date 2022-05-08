package com.org.company.CompanyManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.company.CompanyManagement.model.Resource;
import com.org.company.CompanyManagement.repository.ResourceDAO;

@Service
public class ResourceService {
	
	@Autowired
	ResourceDAO resourceDAO;
	
	public List<Resource> getAllResources(){
		return resourceDAO.getAllResources();
	}

}
