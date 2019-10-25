package com.airline.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.airline.model.FlightSchedule;

@Repository
public class UserFlightRepository implements UserFlightRepoInterface {

	@PersistenceContext
	private EntityManager entityManager;
	
	 @Override
	 public List<FlightSchedule> SearchFlightSchedule(String source, String destination,LocalDate departureDate){
		 
			String jpql= "select fs from FlightSchedule fs where fs.source=:src and fs.destination=:dest and fs.departureDate=:departDate";
			Query q=entityManager.createQuery(jpql);
			q.setParameter("src", source);
			q.setParameter("dest", destination);
			q.setParameter("departDate", departureDate);
			return q.getResultList();
	  
	 }
	
	
	
	
	
}
