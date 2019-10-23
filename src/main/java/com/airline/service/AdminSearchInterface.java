package com.airline.service;

import java.util.List;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;

public interface AdminSearchInterface {
	
	public void addNewFlight(FlightInfo flightInfo);
	public void addNewFlightSchedule(FlightSchedule flightSchedule);
	
	 public List<FlightSchedule> listFlightSchedule();
	 
	 public List<FlightSchedule> getSchedule(String source, String destination,String departureDate);
	 
	 public void deleteSchedule(int scheduleId);

}
