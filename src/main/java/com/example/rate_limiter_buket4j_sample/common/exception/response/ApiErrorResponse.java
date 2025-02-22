package com.example.rate_limiter_buket4j_sample.common.exception.response;

import lombok.Builder;

@Builder
public record ApiErrorResponse(
        int status,
        String code,
        String message
) {}