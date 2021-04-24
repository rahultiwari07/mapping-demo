package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.dao.AbstractGenericDao;
import com.example.model.Company;


@Repository
public class CompanyDaoImpl extends AbstractGenericDao<Company> implements CompanyDao{

}
