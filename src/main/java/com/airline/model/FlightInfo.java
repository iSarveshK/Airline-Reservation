package com.airline.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_FLIGHT_INFO")
public class FlightInfo {
	
	@Id
	@Column(name = "FLIGHT_NUMBER")
	private int flightNumber;
	@Column(name = "FLIGHT_NAME")
	private String flightName;
	@Column(name = "TOTAL_SEAT_ECO")
	private int  economySeats;
	@Column(name = "TOTAL_SEAT_BUSINESS")
	private int  businessSeats;
	
	
	@OneToMany(mappedBy="flightInfo",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<FlightSchedule> flightSchedules;
	


	
	
	public Set<FlightSchedule> getFlightSchedules() {
		return flightSchedules;
	}

	public void setFlightSchedules(Set<FlightSchedule> flightSchedules) {
		this.flightSchedules = flightSchedules;
	}

	public int getEconomySeats() {
		return economySeats;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int EconomySeats() {
		return economySeats;
	}

	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	/*public Set<FlightSchedule> getFlightSchedule() {
		return flightSchedules;
	}

	public void setFlightSchedule(Set<FlightSchedule> flightSchedules) {
		this.flightSchedules = flightSchedules;
	}
	*/
	
	
	
	
	
	
	
	

}
