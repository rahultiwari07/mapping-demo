package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DEPARTMENT")
public class Department implements Serializable {

	
	private static final long serialVersionUID = -5019623265481596682L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="DEPT_CODE")
	private Long deptCode;
	
	@Column(name ="DEPT_NAME")
	private String deptName;

	public Long getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(Long deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	

}
