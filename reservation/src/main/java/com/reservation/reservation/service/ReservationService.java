package com.reservation.reservation.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.reservation.reservation.model.*;
import com.reservation.reservation.repository.*;
import com.reservation.reservation.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReservationService {
	
final Logger logger = LoggerFactory.getLogger(ReservationService.class);

	
	

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation saveReservation(Reservation reservation) {
        logger.info("Inside saveDepartment of DepartmentService");
        return reservationRepository.save(reservation);
    }

    public Reservation findReservationById(String reservationId) {
        logger.info("Inside saveDepartment of DepartmentService");
        return reservationRepository.findByReservationId(reservationId);
    }
}
	


