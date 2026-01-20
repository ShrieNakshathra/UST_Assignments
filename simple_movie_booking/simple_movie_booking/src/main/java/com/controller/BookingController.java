package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Booking;
import com.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // API 6: Book Tickets
    @PostMapping
    public Booking bookTickets(@RequestBody Booking booking) {
        return bookingService.bookTickets(booking);
    }

    // API 7: Get All Bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // API 8: Cancel Booking
    @DeleteMapping("/{bookingId}")
    public String cancelBooking(@PathVariable Long bookingId) {
        bookingService.cancelBooking(bookingId);
        return "Booking cancelled successfully";
    }
}
