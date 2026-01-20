package com.simplemovie.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.simplemovie.entity.Booking;


public interface BookingRepository extends JpaRepository<Booking, Long> {
}