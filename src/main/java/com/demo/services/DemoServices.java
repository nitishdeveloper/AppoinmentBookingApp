package com.demo.services;

import java.util.List;

import com.demo.entity.Appointment;
import com.demo.entity.Department;

public interface DemoServices {
	List<Department> findAllDepartment();
	Appointment bookAppointment(Appointment appointment );
	
}
