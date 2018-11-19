package com.demo.dao;

import java.util.List;

import com.demo.entity.Appointment;
import com.demo.entity.Department;

public interface DemoDao {
	List<Department> findAllDepartment();
	Appointment bookAppointment(Appointment appointment );
	
}
