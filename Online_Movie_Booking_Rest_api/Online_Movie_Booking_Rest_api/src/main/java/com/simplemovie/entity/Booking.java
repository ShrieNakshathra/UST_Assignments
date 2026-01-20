package com.simplemovie.entity;


import java.time.LocalDate;
import jakarta.persistence.*;


@Entity
public class Booking {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long bookingId;


private String customerName;
private int seatsBooked;
private LocalDate bookingDate;


@ManyToOne
@JoinColumn(name = "show_id")
private Show show;


public Long getBookingId() {
	return bookingId;
}


public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
}


public String getCustomerName() {
	return customerName;
}


public void setCustomerName(String customerName) {
	this.customerName = customerName;
}


public int getSeatsBooked() {
	return seatsBooked;
}


public void setSeatsBooked(int seatsBooked) {
	this.seatsBooked = seatsBooked;
}


public LocalDate getBookingDate() {
	return bookingDate;
}


public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}


public Show getShow() {
	return show;
}


public void setShow(Show show) {
	this.show = show;
}


}