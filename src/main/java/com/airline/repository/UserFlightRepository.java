package com.airline.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.airline.model.CityInfo;
import com.airline.model.FlightSchedule;

@Repository
public class UserFlightRepository implements UserFlightRepoInterface {

	@PersistenceContext
	private EntityManager entityManager;
	
	 @Override
	 public List<FlightSchedule> SearchFlightSchedule(String source, String destination ,LocalDate departureDate){
		
			String jpql= "select fs from FlightSchedule fs where fs.source like :src and fs.destination like :dest and fs.departureDate like :departDate";
			
			//
			Query q=entityManager.createQuery(jpql);
			q.setParameter("src", source);
			q.setParameter("dest", destination);
			q.setParameter("departDate", departureDate);
			return q.getResultList();
	  
	 }
	
	 @Override
	 public List<CityInfo> getCities(){
		
			String jpql= "select ci from CityInfo ci";
			Query q=entityManager.createQuery(jpql);
			return q.getResultList();
	  
	 }
	
	
	
	
}
