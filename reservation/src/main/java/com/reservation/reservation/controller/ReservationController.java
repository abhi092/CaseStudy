package com.reservation.reservation.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.reservation.reservation.model.*;
import com.reservation.reservation.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    private final Logger logger =
            LoggerFactory.getLogger(ReservationController.class);

    @PostMapping("/")
    public Reservation saveReservation(@Valid @RequestBody Reservation reservation) {
        logger.info("Inside saveDepartment of Room Controller");
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation findReservationById(@PathVariable("id") String reservationId) {
        logger.info("Inside findDepartmentById method of DepartmentController");
        return reservationService.findReservationById(reservationId);
    }

}