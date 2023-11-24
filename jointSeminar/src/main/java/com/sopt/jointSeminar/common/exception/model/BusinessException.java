package com.sopt.jointSeminar.common.exception.model;

import com.sopt.jointSeminar.common.exception.ErrorStatus;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final ErrorStatus errorStatus;

    public BusinessException(ErrorStatus errorStatus) {
        super(errorStatus.getMessage());
        this.errorStatus = errorStatus;
    }

    public int getHttpStatus() {
        return errorStatus.getHttpStatusCode();
    }
}
