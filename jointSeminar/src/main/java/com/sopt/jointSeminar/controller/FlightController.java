package com.sopt.jointSeminar.controller;

import com.sopt.jointSeminar.common.dto.ApiResponse;
import com.sopt.jointSeminar.common.exception.SuccessStatus;
import com.sopt.jointSeminar.dto.response.FlightGetResponse;
import com.sopt.jointSeminar.dto.response.SeatGetResponse;
import com.sopt.jointSeminar.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @GetMapping
    public ApiResponse<List<FlightGetResponse>> getFlights(@RequestParam String startNation,
                                                           @RequestParam String endNation){
        return ApiResponse.success(SuccessStatus.FLIGHT_GET_OK, flightService.getFlights(startNation, endNation));
    }
}
