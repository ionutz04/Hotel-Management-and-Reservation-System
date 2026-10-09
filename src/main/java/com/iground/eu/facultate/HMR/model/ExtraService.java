package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/** Additional hotel service (breakfast, spa, parking...). Charged per night or once. */
public record ExtraService(@Id Long id, String name, BigDecimal price, boolean perNight) {
}
