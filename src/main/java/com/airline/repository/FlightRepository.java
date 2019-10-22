package com.airline.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;


@Repository
public class FlightRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewFlight(FlightInfo flightInfo) {
		entityManager.merge(flightInfo);
	}
	
	@Transactional
	public void addNewFlightSchedule(FlightSchedule flightSchedule) {
		try {
			entityManager.persist(flightSchedule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
