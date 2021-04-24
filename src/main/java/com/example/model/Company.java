package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="COMPANY")
public class Company implements Serializable {

	
	private static final long serialVersionUID = -5019623265481596682L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="COMP_CODE")
	private Long compCode;
	
	@Column(name ="COMP_NAME")
	private String compName;

	public Long getCompCode() {
		return compCode;
	}

	public void setCompCode(Long compCode) {
		this.compCode = compCode;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
