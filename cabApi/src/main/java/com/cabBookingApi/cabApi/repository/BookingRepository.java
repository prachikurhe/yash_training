package com.cabBookingApi.cabApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabBookingApi.cabApi.dto.CabBookingDTO;
import com.cabBookingApi.cabApi.entity.CabBooking;

@Repository
public interface BookingRepository extends JpaRepository<CabBooking, Integer> {

	List<CabBooking> findByUserMobile(Long userMobile);

}
