package com.capgemini.hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.hotel.dto.Hotel;
@Repository("dao")
public class BookingDAOImpl implements IBookingDAO {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<Hotel> display() {
		
		
	    Query query= entitymanager.createQuery("Select h FROM Hotel h");
	
		List< Hotel> hotels=query.getResultList();
	       
			
		return hotels;
	}

}
