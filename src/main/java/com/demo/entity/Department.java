package com.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.util.DbConstant;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name=DbConstant.TABLE_DEPARTMENT)
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="department_id")
	private Long departmentId;
	
	
	@Column(name="department_name")
	private String departmentName;
	
	
	@Column(name="created_date")
	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date createdDate;
	
	@Column(name="updated_date")
	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date updatedDate;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
	
	
}