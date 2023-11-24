package com.sopt.jointSeminar.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public enum SuccessStatus {
    POST_GET_OK(HttpStatus.OK,"게시물 조회 성공"),
    PROCESS_SUCCESS(HttpStatus.OK, "OK"),
    GET_SEARCH_SECCESS(HttpStatus.OK, "국가 조회 성공"),
    CREATE_PASSENGER_SUCCESS(HttpStatus.CREATED, "승객 예약 생성 성공");

    private final HttpStatus httpStatus;
    private final String message;

    public int getStatusCode() {
        return this.httpStatus.value();
    }
}