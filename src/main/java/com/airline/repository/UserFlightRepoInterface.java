package com.airline.repository;

import java.time.LocalDate;
import java.util.List;

import com.airline.model.FlightSchedule;

public interface UserFlightRepoInterface {

	public List<FlightSchedule> SearchFlightSchedule(String source, String destination,String departureDate);
}

