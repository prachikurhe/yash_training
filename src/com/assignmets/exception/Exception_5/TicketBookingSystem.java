package com.assignmets.exception.Exception_5;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class TicketBookingSystem {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dear customer - Please select \n 1) for normal booking\n" + "2) for Tatkal booking");
		int selection = sc.nextInt();
		System.out.println("Please enter age:: \n");
		int age = sc.nextInt();
		if (age <= 5) {
			throw new AgeGroupExcption("");
		}
		System.out.println("Please enter ticket:: \n");
		int numberOfTicket = sc.nextInt();
		switch (selection) {

		case 1:
			if (isValidNormalTime(now)) {
				
				if (numberOfTicket > 6) {
					throw new BookingLimitExcced("Not Allowed to book more than 6 ticket for normal selection");
				}
				System.out.println(numberOfTicket + " tickets booked..");
			} else {
				throw new NormalTicketBookingException("booking not allowed ");
			}
			break;
		case 2:
			if (isValidNormalTime(now) && isValidTatkalTime(now)) {
				if (numberOfTicket > 4) {
					throw new BookingLimitExcced("Not Allowed to book more than 4 ticket for tatkal selection");
				}
				System.out.println(numberOfTicket + " tickets booked..");
			} else {
				throw new BookingNotAllowedException("booking not allowed ");
			}
			break;
		default:
			throw new RuntimeException("Invalid booking type");
		}

	}

	static boolean isValidNormalTime(LocalDateTime now) {
		return now.isAfter(LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 01, 00))
				&& now.isBefore(LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 23, 00));
	}

	static boolean isValidTatkalTime(LocalDateTime now) {
		return now.isAfter(LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 10, 00))
				&& now.isBefore(LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 12, 00));
	}

}

class AgeGroupExcption extends RuntimeException {

	public AgeGroupExcption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class BookingNotAllowedException extends RuntimeException {

	public BookingNotAllowedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class BookingLimitExcced extends RuntimeException {

	public BookingLimitExcced(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class NormalTicketBookingException extends RuntimeException {

	public NormalTicketBookingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
