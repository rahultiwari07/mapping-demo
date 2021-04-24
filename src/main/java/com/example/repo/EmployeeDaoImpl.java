package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.dao.AbstractGenericDao;
import com.example.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractGenericDao<Employee> implements EmloyeeDao {

}
