package com.cabBookingApi.cabApi.service;

import java.util.List;

import com.cabBookingApi.cabApi.dto.CabBookingDTO;

public interface BookingService {
	public CabBookingDTO bookCab(CabBookingDTO cabBookingDTO);

	List<CabBookingDTO> getBookingDetails();

	List<CabBookingDTO> getBookingDetailsByUserMobile(Long userMobile);

	public void cancelBooking(Integer bookingId);

}
