package com.airline.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

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
	
	
	@Column(name = "SOURCE")
	private String source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	@Column(name = "DEPARTURE_DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate departureDate;
	
	@Column(name = "ARRIVAL_DATE")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate arrivalDate;
	
	
	@Column(name = "DEPARTURE_TIME")
	private String departureTime;
	
	@Column(name = "ARRIVAL_TIME")
	private String arrivalTime;
	
	@Column(name = "SEATS_AVAILABLE_ECONOMY")
	private int  economySeatsAvailable;
	
	@Column(name = "SEATS_AVAILABLE_BUSINESS")
	private int  businessSeatsAvailable;
	
	@Column(name = "STATUS")
	private String status;
	
	/*
	@ManyToOne
	@JoinColumn(name="cityName")
	private CityInfo cityInfo;
	 */
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FLIGHT_NUMBER")
	
	
	private FlightInfo flightInfo;
	
	/*
	@OneToMany(mappedBy="flightSchedule")
	//private BookingInfo bookingInfo;
		*/
	
	
	
	
	public int getBusinessSeatsAvailable() {
		return businessSeatsAvailable;
	}
	public FlightInfo getFlightInfo() {
		return flightInfo;
	}
	public void setFlightInfo(FlightInfo flightInfo) {
		this.flightInfo = flightInfo;
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
