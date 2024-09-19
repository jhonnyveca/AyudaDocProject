package com.fisiunmsm.ayudadoc.infrastructure.exception;


import com.fisiunmsm.ayudadoc.domain.dto.ErrorResponseDto;
import com.fisiunmsm.ayudadoc.domain.exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExpecionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomException(CustomException ex) {
        ErrorResponseDto errorResponse = new ErrorResponseDto(ex.getStatus().value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, ex.getStatus());
    }
}
