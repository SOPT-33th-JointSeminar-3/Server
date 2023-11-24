package com.sopt.jointSeminar.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sopt.jointSeminar.common.exception.ErrorStatus;
import com.sopt.jointSeminar.common.exception.SuccessStatus;
import lombok.*;

import javax.lang.model.type.ErrorType;

@Builder
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private final boolean success;
    private final int code;
    private final String status;
    private T data;

    //    데이터가 없는 응답 성공
    public static ApiResponse<?> success(SuccessStatus success) {
        return new ApiResponse<>(true, success.getStatusCode(), success.getMessage());
    }

    //    데이터가 있는 응답 성공
    public static <T> ApiResponse<T> success(SuccessStatus success, T data) {
        return new ApiResponse<T>(true, success.getStatusCode(), success.getMessage(), data);
    }

    public static ApiResponse<?> error(ErrorStatus error) {
        return new ApiResponse<>(false, error.getHttpStatusCode(), error.getMessage());
    }

    public <T> ApiResponse<T> error(ErrorStatus error, T data) {
        return new ApiResponse<T>(false, error.getHttpStatusCode(), error.getMessage(), data);
    }

    public static <T> ApiResponse<Exception> error(ErrorStatus errorStatus, Exception e) {
        return new ApiResponse<>(false, errorStatus.getHttpStatusCode(), errorStatus.getMessage(), e);
    }


}
