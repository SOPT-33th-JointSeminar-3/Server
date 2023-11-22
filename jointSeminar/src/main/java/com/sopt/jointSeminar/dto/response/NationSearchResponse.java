package com.sopt.jointSeminar.dto.response;

import com.sopt.jointSeminar.domain.Nation;

public record NationSearchResponse(
        Long nationId,
        String nationName,
        String itatCode,
        String city) {

    public static NationSearchResponse of(Nation nation) {
        return new NationSearchResponse(
                nation.getNationId(),
                nation.getNationName(),
                nation.getItatCode(),
                nation.getCity()
        );
    }
}

