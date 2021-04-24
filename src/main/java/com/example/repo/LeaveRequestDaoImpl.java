package com.example.repo;

import org.springframework.stereotype.Repository;

import com.example.dao.AbstractGenericDao;
import com.example.model.LeaveRequest;


@Repository
public class LeaveRequestDaoImpl extends AbstractGenericDao<LeaveRequest> implements LeaveRequestDao {

}
