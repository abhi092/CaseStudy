package com.reservation.reservation.repository;

import com.reservation.reservation.model.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {

    Reservation findByReservationId(String reservationId);
}