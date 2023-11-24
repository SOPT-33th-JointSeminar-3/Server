package com.sopt.jointSeminar.repository;

import com.sopt.jointSeminar.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}