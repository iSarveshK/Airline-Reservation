package com.airline.repository;


import java.util.Date;
import java.util.List;

import com.airline.model.FlightSchedule;



public interface UserFlightRepoInterface {

	public List<FlightSchedule> SearchFlightSchedule(String source, String destination,Date departureDate);
}

