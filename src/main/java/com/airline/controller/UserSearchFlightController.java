package com.airline.controller;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.airline.dto.UserFlightSearchDto;
import com.airline.model.CityInfo;
import com.airline.model.FlightInfo;
import com.airline.model.FlightSchedule;
import com.airline.service.UserFlightServiceInterface;

@Controller
@SessionAttributes({"userLoggedIn", "searchFlightResults","cityList"})
public class UserSearchFlightController {
	
	@Autowired
	private UserFlightServiceInterface userFlightServiceInterface;
	
	@RequestMapping(path = "/viewFlightResults.airline", method = RequestMethod.GET)
	public String flightSearchResults(UserFlightSearchDto data,ModelMap modelMap){

	//List <FlightSchedule> searchFlightResultsList =  null;

	List <FlightSchedule> searchFlightResultsList = userFlightServiceInterface.SearchFlightSchedule(data.getSource(),data.getDestination(),LocalDate.parse(data.getDepartureDate()));
	modelMap.put("searchFlightResults", searchFlightResultsList);
	return "UserFlightSearchResults.jsp";
		
	}
	
	
	@RequestMapping(path = "/UserCitySelect.airline", method = RequestMethod.POST)
	public String getCities(ModelMap modelMap){
	List <CityInfo> citiesList =  userFlightServiceInterface.getCities();
	modelMap.put("cityList", citiesList);

	return "redirect:/UserFlightForm.airline";
		
	}
	
	@RequestMapping(path = "/UserFlightForm.airline", method = RequestMethod.GET)
	public String searchFlightsForm(ModelMap modelMap){

	return "UserFlightSearchTest.jsp";
		
	}

	

}
