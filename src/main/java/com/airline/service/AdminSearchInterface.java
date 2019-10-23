package com.airline.service;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;

public interface AdminSearchInterface {
	
	public FlightSchedule findScheduleById(int scheduleId );
	
	public FlightInfo findFlightInfoById(String flightNumber);
	
	//public void search(Object obj);
	
}
