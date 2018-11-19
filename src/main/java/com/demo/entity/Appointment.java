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
@Table(name=DbConstant.TABLE_APPOINMNENT)
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointment_id")
	private Long appointmentId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="department")
	private String department;
	
	@Column(name="payment_source")
	private String paymentSource;
	
	@Column(name="appointment_fee")
	private Double appointmentFee;
	
	@Column(name="appointment_date")
	@JsonFormat(pattern = "dd-MM-YYYY")
	private String appointmentDate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="created_date")
	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date createdDate;
	
	@Column(name="updated_date")
	@JsonFormat(pattern = "dd-MM-YYYY hh:mm:ss")
	private Date updatedDate;

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPaymentSource() {
		return paymentSource;
	}

	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}


	public Double getAppointmentFee() {
		return appointmentFee;
	}

	public void setAppointmentFee(Double appointmentFee) {
		this.appointmentFee = appointmentFee;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
