package com.cabBookingApi.cabApi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabBookingApi.cabApi.dto.CabBookingDTO;
import com.cabBookingApi.cabApi.entity.CabBooking;
import com.cabBookingApi.cabApi.exception.BookingNotFoundException;
import com.cabBookingApi.cabApi.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingRepository repository;

	@Autowired
	ModelMapper mapper;

	@Override
	public List<CabBookingDTO> getBookingDetails() {
		return repository.findAll().stream().map(cabBook -> mapper.map(cabBook, CabBookingDTO.class))
				.collect(Collectors.toList());

	}

	@Override
	public void cancelBooking(Integer bookingId) {
		Optional<CabBooking> findById = repository.findById(bookingId);
		CabBooking entity = findById.get();
		repository.delete(entity);

	}

	@Override
	public CabBookingDTO bookCab(CabBookingDTO cabBookingDTO) {
		CabBooking cabBook = mapper.map(cabBookingDTO, CabBooking.class);
		CabBooking bookCabk = repository.save(cabBook);
		return mapper.map(bookCabk, CabBookingDTO.class);
	}

	@Override
	public List<CabBookingDTO> getBookingDetailsByUserMobile(Long userMobile) {
		List<CabBooking> getDetails = repository.findByUserMobile(userMobile);
		List<CabBookingDTO> collect = getDetails.stream().map(cab -> mapper.map(cab, CabBookingDTO.class))
				.collect(Collectors.toList());
		if(collect.isEmpty())
			throw new BookingNotFoundException();

		return collect;
	}

}
