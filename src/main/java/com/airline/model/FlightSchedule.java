package com.airline.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="TBL_FLIGHT_SCHEDULE")
public class FlightSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="schdule_sequence" )
	@SequenceGenerator(name="schdule_sequence",sequenceName="flight_schedule_seq",allocationSize=1)
	@Column(name = "SCHEDULE_ID")
	private int scheduleId;
	
	@Column(name = "FLIGHT_NUMBER")
	private String flightNumber;
	
	@Column(name = "DEPARTURE_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate departureDate;
	
	@Column(name = "ARRIVAL_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate arrivalDate;
	
	
	@Column(name = "DEPARTURE_TIME")
	@DateTimeFormat(pattern = "hh:mm:ss")
	private LocalTime departureTime;
	
	@Column(name = "ARRIVAL_TIME")
	@DateTimeFormat(pattern = "hh:mm:ss")
	private LocalTime arrivalTime;
	
	@Column(name = "SEATS_AVAILABLE_ECONOMY")
	private int  economySeatsAvailable;
	@Column(name = "SEATS_AVAILABLE_BUSINESS")
	private int  businessSeatsAvailable;
	@Column(name = "STATUS")
	private String status;
	
	/*
	@ManyToOne
	@JoinColumn(name="routeId")
	private RouteInfo routeInfo;

	
	@ManyToOne
	@JoinColumn(name="flightNumber")
	private FlightInfo flightInfo;
	
	@OneToMany(mappedBy="flightSchedule")
	//private BookingInfo bookingInfo;
		*/
	

	public int getBusinessSeatsAvailable() {
		return businessSeatsAvailable;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public void setBusinessSeatsAvailable(int businessSeatsAvailable) {
		this.businessSeatsAvailable = businessSeatsAvailable;
	}
	
	/*
	public BookingInfo getBookingInfo() {
		return bookingInfo;
	}
	public void setBookingInfo(BookingInfo bookingInfo) {
		this.bookingInfo = bookingInfo;
	}
	*/
	
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEconomySeatsAvailable() {
		return economySeatsAvailable;
	}
	public void setEconomySeatsAvailable(int economySeatsAvailable) {
		this.economySeatsAvailable = economySeatsAvailable;
	}
/*
	public RouteInfo getRouteInfo() {
		return routeInfo;
	}
	public void setRouteInfo(RouteInfo routeInfo) {
		this.routeInfo = routeInfo;
	}
	public FlightInfo getFlightInfo() {
		return flightInfo;
	}
	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
	}
	
	
	*/
	
	
	
	

}
