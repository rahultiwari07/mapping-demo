package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name ="M_EMPLOYEE")
public class Employee implements Serializable {

	
	private static final long serialVersionUID = -5019623265481596682L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="EMP_CODE")
	private Long EmpCode;
	
	@Column(name ="EMP_NAME")
	private String EmpName;
	
	
//	@Column(name ="DEPT_CODE")
//	private String DeptCode;
//	
//	@Column(name ="DEPT_NAME")
//	private String DeptName;
	
	
//	@Column(name ="COMP_CODE")
//	private String comCode;


	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getEmpCode() {
		return EmpCode;
	}


	public void setEmpCode(Long empCode) {
		EmpCode = empCode;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


//	public String getDeptCode() {
//		return DeptCode;
//	}
//
//
//	public void setDeptCode(String deptCode) {
//		DeptCode = deptCode;
//	}
//
//
//	public String getDeptName() {
//		return DeptName;
//	}
//
//
//	public void setDeptName(String deptName) {
//		DeptName = deptName;
//	}


//	public String getComCode() {
//		return comCode;
//	}
//
//
//	public void setComCode(String comCode) {
//		this.comCode = comCode;
//	}


	


	
	
	
}
