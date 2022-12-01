package com.cabBookingApi.cabApi.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cabBooking")
public class CabBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookingId;
	private String source;
	private String destination;
	private	Integer fare;
	private	LocalDate travelDate;
	private	Long userMobile;
	private	String status;
	
	public CabBooking() {
		// TODO Auto-generated constructor stub
	}

	public CabBooking(Integer bookingId, String source, String destination, Integer fare, LocalDate travelDate,
			Long userMobile, String status) {
		super();
		this.bookingId = bookingId;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.travelDate = travelDate;
		this.userMobile = userMobile;
		this.status = status;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
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

	public Integer getFare() {
		return fare;
	}

	public void setFare(Integer fare) {
		this.fare = fare;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Long getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(Long userMobile) {
		this.userMobile = userMobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "CabBooking [bookingId=" + bookingId + ", source=" + source + ", destination=" + destination + ", fare="
				+ fare + ", travelDate=" + travelDate + ", userMobile=" + userMobile + ", status=" + status + "]";
	}
	

}
