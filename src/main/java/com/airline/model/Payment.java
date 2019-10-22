package com.airline.model;

import javax.persistence.*;

//@Entity
@Table(name="TBL_PAYMENT")
public class Payment {
	
	@Id
	private int paymentId;
	private int cardNumber;
	private String modeOfPayment;
	private int ticketCost;
	
	@OneToOne(mappedBy="payments")
	private BookingInfo bookingInfo;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	
	
	
	
	

}
