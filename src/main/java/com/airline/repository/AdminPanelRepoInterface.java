package com.airline.repository;

import java.util.List;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;

public interface AdminPanelRepoInterface {
	
	
	public void addNewFlight(FlightInfo flightInfo);
	public void addNewFlightSchedule(FlightSchedule flightSchedule);
	public FlightSchedule findScheduleById(int scheduleId);
	public FlightInfo findFlightInfoById(int flightNumber);
	
	public List<FlightInfo> listFlightNumber();
	//public List<FlightSchedule> listFlightSchedule();
	//public List<FlightSchedule> SearchFlightSchedule(String source, String destination,String departureDate);
	
}
