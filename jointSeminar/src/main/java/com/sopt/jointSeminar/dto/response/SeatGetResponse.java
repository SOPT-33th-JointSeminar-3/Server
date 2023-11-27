package com.sopt.jointSeminar.dto.response;

import com.sopt.jointSeminar.domain.Seat;

public record SeatGetResponse(
        Long seatId,
        Long flightId,
        String seatClass,
        int price
) {
    public static SeatGetResponse of(Seat seat) {
        return new SeatGetResponse(
                seat.getSeatId(),
                seat.getFlight().getFlightId(),
                seat.getSeatClass(),
                seat.getPrice()
        );
    }
}
