package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public record RoomType(@Id Long id, String name, String description, BigDecimal basePrice, int capacity) {
}
