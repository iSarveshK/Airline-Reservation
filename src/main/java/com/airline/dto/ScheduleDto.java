package com.airline.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;

public class ScheduleDto {
	
	private String flightNumber;
	private String departureDate;
	private String arrivalDate;
	private String departureTime;
	private String arrivalTime;
	private int economySeatsAvailable;
	private int businessSeatsAvailable;
	private String status;

	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getEconomySeatsAvailable() {
		return economySeatsAvailable;
	}
	public void setEconomySeatsAvailable(int economySeatsAvailable) {
		this.economySeatsAvailable = economySeatsAvailable;
	}
	public int getBusinessSeatsAvailable() {
		return businessSeatsAvailable;
	}
	public void setBusinessSeatsAvailable(int businessSeatsAvailable) {
		this.businessSeatsAvailable = businessSeatsAvailable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	

}
