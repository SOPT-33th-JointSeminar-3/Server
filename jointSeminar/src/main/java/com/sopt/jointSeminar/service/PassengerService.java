package com.sopt.jointSeminar.service;

import com.sopt.jointSeminar.domain.Passenger;
import com.sopt.jointSeminar.dto.request.PassengerBookRequest;
import com.sopt.jointSeminar.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Transactional
    public String book(PassengerBookRequest request) {
        Passenger passenger = passengerRepository.save(
                Passenger.builder()
                        .firstname(request.firstname())
                        .lastname(request.lastname())
                        .gender(request.gender())
                        .birth(request.birth())
                        .build()
        );
        return passenger.getPassengerId().toString();
    }
}
