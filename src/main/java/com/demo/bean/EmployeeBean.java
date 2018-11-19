package com.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeBean{

	private Long empId;
	private String empName;
	private Integer empAge;
	private Long empMobile;
	private BigDecimal empSalary;

	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date createdDate;

	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date updatedDate;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(Long empMobile) {
		this.empMobile = empMobile;
	}

	public BigDecimal getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
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
