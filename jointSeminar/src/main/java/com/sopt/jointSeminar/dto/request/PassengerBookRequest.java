package com.sopt.jointSeminar.dto.request;

import java.time.LocalDate;

public record PassengerBookRequest(
        String firstname,
        String lastname,
        String gender,
        LocalDate birth
) {
}
