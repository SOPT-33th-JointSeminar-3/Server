package com.sopt.jointSeminar.common.exception;

import com.sopt.jointSeminar.common.dto.ApiResponse;
import com.sopt.jointSeminar.common.exception.model.BusinessException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

import static com.sopt.jointSeminar.common.exception.ErrorStatus.INTERNAL_SERVER_ERROR;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Void> handleIllegalArgumentException(final IllegalArgumentException e) {
        return ResponseEntity.badRequest().build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    protected ApiResponse<Exception> handleException(final Exception e, final HttpServletRequest request) throws IOException {

        log.error("500 error occured: {}", e.getMessage(), e);

        return ApiResponse.error(INTERNAL_SERVER_ERROR, e);
    }

    @ExceptionHandler({BusinessException.class})
    protected ResponseEntity<ApiResponse> handleBusinessException(BusinessException e) {

        log.error("BusinessmException occured: {}", e.getMessage(), e);

        return ResponseEntity.status(e.getHttpStatus())
                .body(ApiResponse.error(e.getErrorStatus()));
    }

}
