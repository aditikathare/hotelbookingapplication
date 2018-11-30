package com.capgemini.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.hotel.dao.IBookingDAO;
import com.capgemini.hotel.dto.Hotel;
@Transactional
@Service("service")
public class BookingServiceImpl implements IBookingService {
	@Autowired
	IBookingDAO dao;

	@Override
	public List<Hotel> display() {
		// TODO Auto-generated method stub
		return dao.display();
	}
}
