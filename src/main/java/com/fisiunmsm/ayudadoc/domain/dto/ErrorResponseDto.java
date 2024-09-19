package com.fisiunmsm.ayudadoc.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDto {
    private final int status;
    private final String message;
}
