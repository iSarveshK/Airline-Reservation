package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.repository.FlightRepository;

@Service
public class AdminSearch {

	@Autowired
	private FlightRepository flightRepository;

	public void addFlight(FlightInfo flightInfo){
		try {
			flightRepository.addNewFlight(flightInfo);
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}
	

	public void addFlightSchedule(FlightSchedule flightSchedule){
		try {
			flightRepository.addNewFlightSchedule(flightSchedule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void listFlightSchedule() {
		try {
			flightRepository.listFlightSchedule();
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}
	
	
	 public void getSchedule(String source, String destination,String departureDate){
		try {
			flightRepository.getSchedule(source,destination,departureDate);
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}
	
	


}
