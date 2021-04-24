package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="LEAVE_REQUEST")
public class LeaveRequest implements Serializable {

	
	private static final long serialVersionUID = -5019623265481596682L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="LEAVE_CODE")
	private Long leaveCode;
	
	@Column(name ="EMP_CODE")
	private String EmpCode;
	
	@Column(name ="LEAVE_TYPE")
	private String leaveType;

	public Long getLeaveCode() {
		return leaveCode;
	}

	public void setLeaveCode(Long leaveCode) {
		this.leaveCode = leaveCode;
	}

	public String getEmpCode() {
		return EmpCode;
	}

	public void setEmpCode(String empCode) {
		EmpCode = empCode;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
