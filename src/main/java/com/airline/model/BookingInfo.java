package com.airline.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//@Entity
@Entity
@Table(name="Tbl_Booking_Info")
public class BookingInfo {
	
	private int bookingId;
	private LocalDate bookingDate;
	private LocalDateTime bookingTime;
	private int seats;
	/*
	
	@OneToOne(mappedBy="bookings")
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name="scheduleId")
	private FlightSchedule flightSchedule;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	@OneToMany(mappedBy="passengerId")
	Set<PassengerInfo> passengerInfo;
	*/
	

}
