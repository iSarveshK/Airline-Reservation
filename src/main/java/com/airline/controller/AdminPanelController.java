package com.airline.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airline.dto.FlightDto;
import com.airline.dto.ScheduleDto;
import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.repository.AdminPanelRepoInterface;
import com.airline.service.AdminPanelService;
import com.airline.service.AdminPanelServiceInterface;


@Controller
public class AdminPanelController {
	
		@Autowired
		private AdminPanelServiceInterface adminPanelServiceInterface;
		
		@RequestMapping(path = "/adminpanel.airline", method = RequestMethod.POST)
		public String addFlight(FlightDto data, Map model){
			
		FlightInfo f = new FlightInfo();
		f.setFlightNumber(data.getFlightNumber());
		f.setFlightName(data.getFlightName());
		f.setBusinessSeats(data.getBusinessSeats());
		f.setEconomySeats(data.getEconomySeats());
		
		adminPanelServiceInterface.addFlight(f);;

		return "FlightAdd.jsp";
			
		}
		
		
		@RequestMapping(path = "/addschedule.airline", method = RequestMethod.POST)
		public String addSchedule(ScheduleDto data, Map model){
		FlightSchedule fs = new FlightSchedule();
		fs.setDepartureDate(LocalDate.parse(data.getDepartureDate()));
		fs.setArrivalDate(LocalDate.parse(data.getArrivalDate()));
		fs.setDepartureTime(LocalTime.parse(data.getDepartureTime()));
		fs.setArrivalTime(LocalTime.parse(data.getArrivalTime()));
		fs.setBusinessSeatsAvailable(data.getBusinessSeatsAvailable());
		fs.setEconomySeatsAvailable(data.getEconomySeatsAvailable());
		fs.setStatus(data.getStatus());
		fs.setSource(data.getSource());
		fs.setDestination(data.getDestination());
		
	
		
		adminPanelServiceInterface.addFlightSchedule(fs);

		return "FlightAddSchedule.jsp";
			
		}


}
