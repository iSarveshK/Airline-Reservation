package com.airline.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
@Table(name = "TBL_ROUTE_INFO")
public class RouteInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int routeId;
	private String source;
	private String destination;
	
	@OneToMany(mappedBy="routeInfo",cascade=CascadeType.ALL)
	Set<FlightSchedule> flightSchedules;

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

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

	public Set<FlightSchedule> getFlightSchedule() {
		return flightSchedules;
	}

	public void setFlightSchedule(Set<FlightSchedule> flightSchedule) {
		this.flightSchedules = flightSchedules;
	}

	
	
	
	
	
	
	

}
