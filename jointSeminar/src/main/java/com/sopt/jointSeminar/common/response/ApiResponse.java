package com.sopt.jointSeminar.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private final boolean success;
    private final int code;
    private final String status;
    private T data;

    public static <T> ApiResponse<T> success(SuccessStatus success, T data) {
        return new ApiResponse<T>(true, success.getStatusCode(), success.getMessage(), data);
    }
}
