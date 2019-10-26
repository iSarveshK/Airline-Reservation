package com.airline.controller;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.airline.dto.UserFlightSearchDto;
import com.airline.model.CityInfo;
import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.service.UserFlightServiceInterface;

@Controller
public class UserSearchFlightController {
	
	@Autowired
	private UserFlightServiceInterface userFlightServiceInterface;
	
	@RequestMapping(path = "/UserSearchFlight.airline", method = RequestMethod.GET)
	public String flightSearchResults(UserFlightSearchDto data,Map model){
	List <FlightSchedule> searchFlightResultsList =  userFlightServiceInterface.SearchFlightSchedule(data.getSource(),data.getDestination(),LocalDate.parse(data.getDepartureDate()));
	
	model.put("searchFlightResults", searchFlightResultsList);

	return "UserFlightSearchResults.jsp";
		
	}
	
	
	@RequestMapping(path = "/UserCitySelect.airline", method = RequestMethod.GET)
	public String getCities(Map model){
	List <CityInfo> citiesList =  userFlightServiceInterface.getCities();
	System.out.println(citiesList.get(0));
	
	model.put("cityList", citiesList);

	return "CitySelectResult.jsp";
		
	}
	
	
	

}
