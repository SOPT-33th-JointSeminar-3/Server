package com.sopt.jointSeminar.dto.response;

import com.sopt.jointSeminar.domain.Flight;

import java.util.List;

public record FlightGetResponse(
        Long id,
        String startTime,
        String endTime,
        String durationTime,
        Boolean isLowestPrice,
        List<SeatGetResponse> seats
) {
    public static FlightGetResponse of(Flight flight, Boolean isLowestPrice, List<SeatGetResponse> seats) {
        return new FlightGetResponse(
                flight.getFlightId(),
                flight.getStartTime(),
                flight.getEndTime(),
                flight.getDurationTime(),
                isLowestPrice,
                seats
        );
    }
}
