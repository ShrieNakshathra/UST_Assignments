package com.simplemovie.service;


import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import com.simplemovie.repository.ShowRepository;


@Service
public class BookingService {


@Autowired
private BookingRepository bookingRepository;


@Autowired
private ShowRepository showRepository;


public Booking bookTickets(Booking booking) {
Show show = showRepository.findById(booking.getShow().getShowId()).orElseThrow();


if (booking.getSeatsBooked() > show.getAvailableSeats()) {
throw new RuntimeException("Not enough seats available");
}


show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
booking.setBookingDate(LocalDate.now());//Booking dae should auto generated
booking.setShow(show);


showRepository.save(show);
return bookingRepository.save(booking);
}


public List<Booking> getAllBookings() {
return bookingRepository.findAll();
}


public void cancelBooking(Long bookingId) {
Booking booking = bookingRepository.findById(bookingId).orElseThrow();
Show show = booking.getShow();


show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
showRepository.save(show);
bookingRepository.deleteById(bookingId);
}
}