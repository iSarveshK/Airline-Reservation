package com.airline.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.airline.model.FlightSchedule;

public interface UserFlightServiceInterface {
	
	public List<FlightSchedule> SearchFlightSchedule(String source, String destination,LocalDate departureDate);

}
