package com.sopt.jointSeminar.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Error {
    NOT_FOUND_NATION_ERROR(HttpStatus.NOT_FOUND, "존재하지 않는 국가"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 서버 에러");

    private final HttpStatus httpStatus;
    private final String Msg;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
