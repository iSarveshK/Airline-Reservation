package com.airline.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;


@Repository
public class AdminPanelRepository implements AdminPanelRepoInterface{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public void addNewFlight(FlightInfo flightInfo) {
		entityManager.merge(flightInfo);
	}
	
	@Transactional
	@Override
	public void addNewFlightSchedule(FlightSchedule flightSchedule) {
		try {
			entityManager.persist(flightSchedule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public FlightSchedule findScheduleById(int scheduleId){
		
		return entityManager.find(FlightSchedule.class, scheduleId);
		
	}
	
	@Override
	public FlightInfo findFlightInfoById(int flightNumber) {
		
		FlightInfo fi = entityManager.find(FlightInfo.class, flightNumber);
	    return fi;
	}
	
	public List<FlightInfo> listFlightNumber(){
		String jpql= "select fi.flightNumber from FlightInfo fi";
		Query q=entityManager.createQuery(jpql);
		return q.getResultList();
	}
	
	/*
	
	
	
	 @Override
	 public List<FlightInfo> listFlightInfo() {
		 	String jpql= "select fi from FlightInfo fi";
			Query q=entityManager.createQuery(jpql);
			return q.getResultList();
		 
	 }
	 
	 
	  @Override
	 public List<FlightSchedule> listFlightSchedule() {
		 	String jpql= "select fs from FlightSchedule fs";
			Query q=entityManager.createQuery(jpql);
			return q.getResultList();
	 }
	 
	 @Override
	 public List<FlightSchedule> SearchFlightSchedule(String source, String destination,String departureDate){
		 
			String jpql= "select fs from FlightSchedule fs where source:=src and destination:=dest and departureDate=:departDate";
			Query q=entityManager.createQuery(jpql);
			q.setParameter("src", source);
			q.setParameter("dest", destination);
			q.setParameter("departDate", departureDate);
			return q.getResultList();
	  
	 }
	 
	 /*
	 /*
	 @Override
	 public void deleteSchedule(int scheduleId) {
				entityManager.remove(scheduleId);
			}
	  
	 }
	*/
	
	
}

