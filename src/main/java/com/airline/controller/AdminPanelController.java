package com.airline.controller;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.airline.dto.FlightDto;
import com.airline.dto.ScheduleDto;
import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.repository.AdminPanelRepoInterface;
import com.airline.service.AdminPanelService;
import com.airline.service.AdminPanelServiceInterface;
import com.airline.service.AdminSearchInterface;


@Controller
@SessionAttributes({"schedule", "flightNumbers"})
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
		
		adminPanelServiceInterface.addFlight(f);
		//adminPanelServiceInterface.listFlightNumber();
		
		
		return "redirect:/showAddSchedule.airline";
			
		}
		
		@RequestMapping(path = "/showAddSchedule.airline", method = RequestMethod.GET)
		public String showAddSchedule(Map model) {
			List<FlightInfo> flightNumberList =  adminPanelServiceInterface.listFlightInfo();
			model.put("flightnumbers", flightNumberList);
			return "AddSchedule.jsp";
		}
		
		
		@RequestMapping(path = "/addschedule.airline", method = RequestMethod.POST)
		public String addSchedule(ScheduleDto data, Map model){
		FlightSchedule fs = new FlightSchedule();
		FlightInfo fi = (FlightInfo) adminPanelServiceInterface.findFlightInfoById(data.getFlightNumber());
	
		
		fs.setFlightInfo(fi);
		fs.setDepartureDate(LocalDate.parse(data.getDepartureDate()));
		fs.setArrivalDate(LocalDate.parse(data.getArrivalDate()));
		fs.setDepartureTime(data.getDepartureTime());
		fs.setArrivalTime(data.getArrivalTime());
		fs.setBusinessSeatsAvailable(data.getBusinessSeatsAvailable());
		fs.setEconomySeatsAvailable(data.getEconomySeatsAvailable());
		fs.setStatus(data.getStatus());
		fs.setSource(data.getSource());
		fs.setDestination(data.getDestination());
		
	
		
		adminPanelServiceInterface.addFlightSchedule(fs);

		return "Confirmation.jsp";
			
		}
		
		@RequestMapping(path = "/searchSchedule.airline", method = RequestMethod.POST)
		public String viewSchedule(@RequestParam("scheduleId") int scheduleId , Map model){
	
		FlightSchedule schedule = adminPanelServiceInterface.findScheduleById(scheduleId);
		List<FlightInfo> flightNumberList =  adminPanelServiceInterface.listFlightInfo();
		
		model.put("schedule", schedule);

		model.put("flightnumbers", flightNumberList);
	
		return "scheduleview.jsp";
			
		}
		
		@RequestMapping(path = "/viewflightInfo.airline", method = RequestMethod.GET)
		public String viewFlightInfo(Map model){
	
	
		List<FlightInfo> flightInfoObj =  adminPanelServiceInterface.listFlightInfo();
		
System.out.println("Kashika view flight");
		model.put("flightInformation", flightInfoObj);
	
		return "viewFlightInfo.jsp";
			
		}
		
		@RequestMapping(path = "/viewflightSchedule.airline", method = RequestMethod.GET)
		public String viewFlightSchedule(Map model){
		List<FlightSchedule> flightScheduleObj =  adminPanelServiceInterface.listFlightSchedule();
		
		model.put("flightScheduleInformation", flightScheduleObj);
	
		return "viewFlightSchedule.jsp";
			
		}
		

}
