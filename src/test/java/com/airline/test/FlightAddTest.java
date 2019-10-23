package com.airline.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.repository.FlightRepository;
import com.airline.service.AdminSearch;

public class FlightAddTest {
	
	@Test
	public void addFlightAndSchedule(){
		
		FlightInfo flightInfo = new FlightInfo();
	//	flightInfo.setFlightNumber("F101");
		flightInfo.setFlightName("Boeing 707");
		flightInfo.setBusinessSeats(50);
		flightInfo.setEconomySeats(100);

		
		/*
		FlightSchedule flightSchedule = new FlightSchedule();
		flightSchedule.setScheduleId(121);
		flightSchedule.setDepartureDate(LocalDate.now());
		flightSchedule.setArrivalDate(LocalDate.now());
		flightSchedule.setDepartureTime(LocalDateTime.now());
		flightSchedule.setArrivalTime(LocalDateTime.now());
		flightSchedule.setStatus("Cancelled");
		 */
		AdminSearch flightService = new AdminSearch();
		flightService.addFlight(flightInfo);
		//flightService.addFlightSchedule(flightSchedule);
	
		
	}
	
	@Test
	public void add(){
		FlightInfo flightInfo = new FlightInfo();
		//flightInfo.setFlightNumber("F101");
		flightInfo.setFlightName("Boeing 707");
		flightInfo.setBusinessSeats(50);
		flightInfo.setEconomySeats(100);
		
		AdminSearch flightService = new AdminSearch();
		flightService.addFlight(flightInfo);
	}

}
