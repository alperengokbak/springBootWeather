package com.dev.weather.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) {
}
