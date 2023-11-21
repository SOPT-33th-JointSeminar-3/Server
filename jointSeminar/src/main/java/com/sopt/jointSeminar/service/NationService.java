package com.sopt.jointSeminar.service;


import com.sopt.jointSeminar.domain.Nation;
import com.sopt.jointSeminar.dto.response.NationSearchResponse;
import com.sopt.jointSeminar.repository.NationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NationService {
    private final NationJpaRepository nationJpaRepository;

    public List<NationSearchResponse> searchNation(String words) {

        return nationJpaRepository.findByNationNameContainingOrItatCodeContainingOrCityContaining(words, words, words)
                .stream()
                .map(NationSearchResponse::of)
//                .map(nation -> NationSearchResponse.of(nation))
                .toList();
    }
}
