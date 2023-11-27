package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightJpaRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByStartNationAndEndNation(String startNation, String endNation);
}
