package com.airline.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.FlightSchedule;
import com.airline.repository.AdminPanelRepoInterface;
import com.airline.repository.UserFlightRepoInterface;

@Service
public class UserFlightService implements UserFlightServiceInterface {
	
	@Autowired
	private UserFlightRepoInterface userFlightRepoInterface;
	
	public List<FlightSchedule> SearchFlightSchedule(String source, String destination,Date departureDate)
	{
		
		return userFlightRepoInterface.SearchFlightSchedule(source, destination, departureDate);
	}

}
