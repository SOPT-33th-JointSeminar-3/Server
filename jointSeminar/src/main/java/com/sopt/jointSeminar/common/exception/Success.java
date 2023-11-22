package com.sopt.jointSeminar.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Success {

    PROCESS_SUCCESS(HttpStatus.OK, "OK"),
    GET_SEARCH_SECCESS(HttpStatus.OK, "국가 조회 성공");

    private final HttpStatus httpStatus;
    private final String msg;

//    현재 상태 코드 반환
    public int getHttpStatusCode() {
        return httpStatus.value();
    }

}
