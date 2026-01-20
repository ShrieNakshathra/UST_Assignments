
package com.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Booking;
import com.entity.Show;
import com.repository.BookingRepository;
import com.repository.ShowRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    public Booking bookTickets(Booking booking) {

        Long showId = booking.getShow().getShowId();
        Show show = showRepository.findById(showId)
                .orElseThrow(() -> new RuntimeException("Show not found"));

        Integer seatsRequested = booking.getSeatsBooked();

        if (seatsRequested > show.getAvailableSeats()) {
            throw new RuntimeException("Not enough seats available");
        }

        // Reduce seats
        show.setAvailableSeats(show.getAvailableSeats() - seatsRequested);
        showRepository.save(show);

        // Set booking details
        booking.setShow(show);
        booking.setBookingDate(LocalDate.now());

        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public void cancelBooking(Long bookingId) {

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        Show show = booking.getShow();

        // Restore seats
        show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
        showRepository.save(show);

        bookingRepository.deleteById(bookingId);
    }
}
