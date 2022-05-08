package com.org.company.CompanyManagement.repository;

import java.util.List;

import com.org.company.CompanyManagement.model.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ResourceDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Resource> getAllResources(){
		//entityManager.getTransaction().begin(); No need to write since @Transactional will manage transaction.
		return entityManager.createQuery("Select * from resource").getResultList();
	}

}
