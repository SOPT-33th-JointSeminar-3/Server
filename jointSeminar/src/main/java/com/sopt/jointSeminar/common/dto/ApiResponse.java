package com.sopt.jointSeminar.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sopt.jointSeminar.common.exception.Success;
import com.sopt.jointSeminar.common.exception.Error;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
// 직렬화 할 때 property 순서 지정
@JsonPropertyOrder({"code", "status", "data"})
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {

    private final int code;
    private final String mgs;

//    null인 데이터는 제외
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

//    데이터가 없는 응답 성공
    public static ApiResponse<?> success(Success success) {
        return new ApiResponse<>(success.getHttpStatusCode(), success.getMsg());
    }

//    데이터가 있는 응답 성공
    public static <T> ApiResponse<T> success(Success success, T data) {
        return new ApiResponse<T>(success.getHttpStatusCode(), success.getMsg(), data);
    }

    public static ApiResponse<?> error(Error error) {
        return new ApiResponse<>(error.getHttpStatusCode(), error.getMsg());
    }

    public <T> ApiResponse<T> error(Error error, T data) {
        return new ApiResponse<T>(error.getHttpStatusCode(), error.getMsg(), data);
    }

}

