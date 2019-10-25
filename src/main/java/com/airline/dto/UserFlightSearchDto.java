package com.airline.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class UserFlightSearchDto {
	
	private String source;
	private String destination;
	private String departureDate;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
}
