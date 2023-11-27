package com.sopt.jointSeminar.service;

import com.sopt.jointSeminar.domain.Flight;
import com.sopt.jointSeminar.domain.Seat;
import com.sopt.jointSeminar.dto.response.FlightGetResponse;
import com.sopt.jointSeminar.dto.response.SeatGetResponse;
import com.sopt.jointSeminar.repository.FlightJpaRepository;
import com.sopt.jointSeminar.repository.SeatJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FlightService {

    private final FlightJpaRepository flightJpaRepository;
    private final SeatJpaRepository seatJpaRepository;

    public List<FlightGetResponse> getFlights() {
        return flightJpaRepository.findAll()
                .stream()
                .map(flight -> FlightGetResponse.of(flight, isLowestFlight(flight), getSeats(flight.getFlightId())))
                .toList();
    }

    public List<FlightGetResponse> getFlights(String startNation, String endNation) {
        List<Flight> flights = flightJpaRepository.findByStartNationAndEndNation(startNation, endNation);
        return flightJpaRepository.findByStartNationAndEndNation(startNation, endNation)
                .stream()
                .map(flight -> FlightGetResponse.of(flight, isLowestFlight(flight), getSeats(flight.getFlightId())))
                .toList();
    }

    public List<SeatGetResponse> getSeats(Long flightId) {
        return seatJpaRepository.findByFlightFlightId(flightId)
                .stream()
                .map(seat -> SeatGetResponse.of(seat))
                .toList();
    }

    public int getLowestPrice() {
        List<Seat> allSeats = seatJpaRepository.findAll();
        Collections.sort(allSeats);
        return allSeats.get(0).getPrice();
    }

    public Boolean isLowestFlight(Flight flight) {
        int lowestPrice = getLowestPrice();
        List<Seat> seats = seatJpaRepository.findByFlightFlightId(flight.getFlightId());
        if (seats.size() > 0) {
            Collections.sort(seats);
            return (seats.get(0).getPrice() == lowestPrice);
        }
        return false;
    }
}
