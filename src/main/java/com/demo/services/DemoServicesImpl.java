package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DemoDao;
import com.demo.entity.Appointment;
import com.demo.entity.Department;


@Service
public class DemoServicesImpl implements DemoServices {

	@Autowired
	DemoDao demoDao;

	public List<Department> findAllDepartment() {
		return demoDao.findAllDepartment();
	}

	public Appointment bookAppointment(Appointment appointment) {
		return demoDao.bookAppointment(appointment);
	}

	
	
}
