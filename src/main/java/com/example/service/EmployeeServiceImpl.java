package com.example.service;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AbstractGenericDao;
import com.example.model.Employee;
import com.example.repo.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmloyeeService {

	@Autowired EmployeeDaoImpl employeeDao;
	@Autowired SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.saveOrUpdate(employee);
	    session.getTransaction().commit();
	}

}
