package com.sopt.jointSeminar.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public enum SuccessStatus {
    FLIGHT_GET_OK(HttpStatus.OK, "항공편 조회 성공"),
    POST_GET_OK(HttpStatus.OK,"게시물 조회 성공"),
    PROCESS_SUCCESS(HttpStatus.OK, "OK"),
    GET_SEARCH_SECCESS(HttpStatus.OK, "국가 조회 성공");

    private final HttpStatus httpStatus;
    private final String message;

    public int getStatusCode() {
        return this.httpStatus.value();
    }
}