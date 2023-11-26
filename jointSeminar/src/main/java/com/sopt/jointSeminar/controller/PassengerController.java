package com.sopt.jointSeminar.controller;

import com.sopt.jointSeminar.common.dto.ApiResponse;
import com.sopt.jointSeminar.common.exception.SuccessStatus;
import com.sopt.jointSeminar.service.PassengerService;
import com.sopt.jointSeminar.dto.request.PassengerBookRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/passenger")
@RequiredArgsConstructor
public class PassengerController {

    private final PassengerService passengerService;

    @PostMapping
    public ApiResponse<?> bookPassenger(@RequestBody PassengerBookRequest request) {
        return ApiResponse.success(SuccessStatus.CREATE_PASSENGER_SUCCESS, passengerService.book(request));
    }
}
