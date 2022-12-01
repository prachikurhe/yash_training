package com.cabBookingApi.cabApi.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabBookingApi.cabApi.CabApiApplication;
import com.cabBookingApi.cabApi.dto.ApiResponse;
import com.cabBookingApi.cabApi.dto.CabBookingDTO;
import com.cabBookingApi.cabApi.service.BookingService;

@RestController
public class CabBookingApi {
	private static final Log LOGGER = LogFactory.getLog(CabApiApplication.class);
	
	@Autowired
	Environment environment;
	
	@Autowired
	BookingService bookingService;

	@PostMapping("/bookings")
	public ResponseEntity<CabBookingDTO> bookCab(@RequestBody CabBookingDTO cabBookingDTO) {
		CabBookingDTO cabEntity = bookingService.bookCab(cabBookingDTO);
		LOGGER.info("\n" + environment.getProperty("UserInterface.INSERT_SUCCESS")+""+ cabEntity.getBookingId());
		return new ResponseEntity<CabBookingDTO>(cabEntity , HttpStatus.CREATED);
	}

	@GetMapping("/bookings")
	public ResponseEntity<List<CabBookingDTO>> getBookingDetails() {
		List<CabBookingDTO>list=bookingService.getBookingDetails();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/bookings/{userMobile}")
	public ResponseEntity<List<CabBookingDTO>> getBookingDetailsByUserMobile(@PathVariable Long userMobile){
		List<CabBookingDTO>bookDto=bookingService.getBookingDetailsByUserMobile(userMobile);
		return ResponseEntity.ok(bookDto);
	}

	@DeleteMapping("bookings/{bookingId}")
	public ResponseEntity<ApiResponse> cancelBooking(@PathVariable Integer bookingId) {
		bookingService.cancelBooking(bookingId);
		LOGGER.info("\n" + environment.getProperty("UserInterface.DELETE_SUCCESS"));

		return new ResponseEntity<ApiResponse>(new ApiResponse("Booking cancelled successfully",true),HttpStatus.OK);
	}

		
	

}
