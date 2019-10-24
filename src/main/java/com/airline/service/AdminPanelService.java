package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.repository.AdminPanelRepoInterface;
import com.airline.repository.AdminPanelRepository;

@Service
public class AdminPanelService  implements AdminPanelServiceInterface {

	@Autowired
	private AdminPanelRepoInterface adminPanelRepoInterface ;

	public void addFlight(FlightInfo flightInfo){
		try {
			adminPanelRepoInterface.addNewFlight(flightInfo);
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}

	public void addFlightSchedule(FlightSchedule flightSchedule){
		try {
			adminPanelRepoInterface.addNewFlightSchedule(flightSchedule);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public FlightSchedule findScheduleById(int scheduleId){

		return adminPanelRepoInterface.findScheduleById(scheduleId);
	}
	@Override
	public FlightInfo findFlightInfoById(int flightNumber){

		 return adminPanelRepoInterface.findFlightInfoById(flightNumber);
	
		
	}
	/*

	public List<FlightInfo> listFlightInfo(){
	return adminPanelRepoInterface.listFlightInfo();
	}

	 public List<FlightSchedule> listFlightSchedule(){
			return adminPanelRepoInterface.listFlightSchedule();

	 }
	 */
	 
	 
	 
	 
}




