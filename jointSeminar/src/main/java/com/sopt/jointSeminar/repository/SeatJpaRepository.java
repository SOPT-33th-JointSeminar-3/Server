package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatJpaRepository extends JpaRepository<Seat, Long> {

    List<Seat> findByFlightFlightId(Long flightId);
    List<Seat> findAll();
}