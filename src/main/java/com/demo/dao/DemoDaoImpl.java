package com.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Appointment;
import com.demo.entity.Department;

@Transactional
@Repository
public class DemoDaoImpl implements DemoDao {

	@Autowired
	SessionFactory session;

	
	public List<Department> findAllDepartment() {
		Query query=session.getCurrentSession().createQuery("From Department");
		List<Department> list=query.list();
		return list;
	}


	public Appointment bookAppointment(Appointment appointment) {
		Long proxcyId = (Long) session.getCurrentSession().save(appointment);
		if(proxcyId!=null) {
			Criteria criteria=session.getCurrentSession().createCriteria(Appointment.class)
					.add(Restrictions.eq("appointmentId", proxcyId));
			Appointment appoint =(Appointment) criteria.uniqueResult();
			return appoint;
		}
		return null;	
	}

}//end class
