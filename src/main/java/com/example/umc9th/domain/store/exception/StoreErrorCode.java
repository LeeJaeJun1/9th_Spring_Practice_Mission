package com.example.umc9th.domain.store.exception;

import com.example.umc9th.global.apiPayload.code.BaseErrorCode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum StoreErrorCode implements BaseErrorCode {
    STORE_NOT_FOUND(HttpStatus.NOT_FOUND,
            "STORE_COMMON404_1",
            "요청한 가게를 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;

    @Override
    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
