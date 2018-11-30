package com.capgemini.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.hotel.dto.Hotel;
import com.capgemini.hotel.service.IBookingService;
@Controller
public class SpringController {
@Autowired
IBookingService service;	

@RequestMapping(value="hoteldetails")
public ModelAndView viewAll(){
	
	List<Hotel> hotels=service.display();
	return new ModelAndView("HotelDetails","hotels",hotels);
}
	
/*@RequestMapping(value="bookingconfirmation")
public ModelAndView success(@RequestParam("name") String name){
	return new ModelAndView("BookingConfirmation","name",name);
}
	*/
@RequestMapping(value="bookingconfirmation")
public String success(String name){
	return "BookingConfirmation";
}

	
	
}
	