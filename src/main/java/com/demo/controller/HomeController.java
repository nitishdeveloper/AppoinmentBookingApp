package com.demo.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.Appointment;
import com.demo.services.DemoServices;
@Controller  
public class HomeController {  
	
	@Autowired
	DemoServices services; 
	
/************************************* Welcome home page **********************************************/	
	@RequestMapping("/home.html")
	public ModelAndView findAllEmployee() {
		System.out.println("Inside Home");
		return new ModelAndView("home","departments",services.findAllDepartment());
	}
 
/************************************* book appointment page **********************************************/
	@RequestMapping(value = "/bookappointment.html", method = RequestMethod.POST)
	public ModelAndView bookAppontmentPage(@ModelAttribute("appoinment") Appointment appointmentRequest,
			HttpServletRequest request, HttpSession session) {
		System.out.println("Inside bookAppontmentPage : ");
		appointmentRequest.setCreatedDate(Calendar.getInstance().getTime());
		Appointment isBooked = services.bookAppointment(appointmentRequest);
		if(isBooked!=null) {
			System.out.println("Inside Home");
			session.setAttribute("appointmentSession", isBooked);
			return new ModelAndView("sussessAppointment","sessiondata",session.getAttribute("appointmentSession"));
		}
		return new ModelAndView("sussessAppointment","msg","oopss something wrong...!!!");
	}
}