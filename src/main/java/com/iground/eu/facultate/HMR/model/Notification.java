package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;

import java.time.Instant;

public record Notification(@Id Long id, Long guestId, Long reservationId, NotificationType type,
                           String message, Instant createdAt) {
}
