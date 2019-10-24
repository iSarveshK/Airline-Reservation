package com.airline.service;

import java.util.List;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;

public interface AdminPanelServiceInterface {

	public void addFlight(FlightInfo flightInfo);
	public void addFlightSchedule(FlightSchedule flightSchedule);
	public FlightSchedule findScheduleById(int scheduleId );
	public FlightInfo findFlightInfoById(int flightNumber);
	//public List<FlightInfo> listFlightInfo();
	//public List<FlightSchedule> listFlightSchedule();
}
