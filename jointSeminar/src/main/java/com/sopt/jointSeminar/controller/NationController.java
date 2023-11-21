package com.sopt.jointSeminar.controller;

import com.sopt.jointSeminar.common.dto.ApiResponse;
import com.sopt.jointSeminar.common.exception.Success;
import com.sopt.jointSeminar.dto.response.NationSearchResponse;
import com.sopt.jointSeminar.service.NationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nation")
@RequiredArgsConstructor
public class NationController {

    private final NationService nationService;

    @GetMapping("/searchv1")
    public ResponseEntity<List<NationSearchResponse>> searchNationv1(@RequestParam String nation) {
        return ResponseEntity.ok(nationService.searchNation(nation));
    }

    @GetMapping("/search")
    public ApiResponse<List<NationSearchResponse>> searchNation(@RequestParam String nation) {
        return ApiResponse.success(Success.GET_SEARCH_SECCESS, nationService.searchNation(nation));
    }


}
