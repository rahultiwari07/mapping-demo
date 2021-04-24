package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.dao.AbstractGenericDao;
import com.example.model.Department;

@Repository
public class DepartmentDaoImpl extends AbstractGenericDao<Department> implements DepartmentDao{

}
