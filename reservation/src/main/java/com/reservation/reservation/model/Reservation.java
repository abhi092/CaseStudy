package com.reservation.reservation.model;

import java.util.Date;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;



//@AllArgsConstructor
//@Builder
//@Getter
//@Setter
@Document(collection = "reservation")
public class Reservation {
    @Id
    
    
    
  
    private String reservationId;
    
    
    private Date checkinDate;
    
    private Date checkoutDate;
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public Reservation(String reservationId,  Date checkinDate,  Date checkoutDate) {
		super();
		this.reservationId = reservationId;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
	}
	public Reservation() {
		
	}
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", checkinDate=" + checkinDate + ", checkoutDate="
				+ checkoutDate + "]";
	}
	


  
}