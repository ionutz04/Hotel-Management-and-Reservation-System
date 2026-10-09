package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/** pricePerNight, when set, overrides the base price of the room type. */
public record Room(@Id Long id, String number, Long roomTypeId, int floor, RoomStatus status,
                   BigDecimal pricePerNight) {

    public Room withStatus(RoomStatus newStatus) {
        return new Room(id, number, roomTypeId, floor, newStatus, pricePerNight);
    }
}
