package com.reservation.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ReservationapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationapiApplication.class, args);
	}

}
