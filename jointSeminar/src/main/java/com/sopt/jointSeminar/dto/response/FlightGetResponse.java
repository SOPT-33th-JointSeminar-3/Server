package com.sopt.jointSeminar.dto.response;

import com.sopt.jointSeminar.domain.Flight;

import java.util.List;

public record FlightGetResponse(
        Long id,
        String startTime,
        String endTime,
        String durationTime,
        List<SeatGetResponse> seats
) {
    public static FlightGetResponse of(Flight flight, List<SeatGetResponse> seats) {
        return new FlightGetResponse(
                flight.getFlightId(),
                flight.getStartTime(),
                flight.getEndTime(),
                flight.getDurationTime(),
                seats
        );
    }
}
