package com.airline.repository;

import java.util.List;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;

public interface AdminPanelRepoInterface {
	
	
	public void addNewFlight(FlightInfo flightInfo);
	public void addNewFlightSchedule(FlightSchedule flightSchedule);
	//public List<FlightInfo> findFlightInfoById(String flightNumber);
	public FlightSchedule findScheduleById(int scheduleId);
	
}
