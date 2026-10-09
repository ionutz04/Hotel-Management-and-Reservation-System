package com.iground.eu.facultate.HMR.model;

public enum ReservationStatus {
    PENDING, CONFIRMED, CHECKED_IN, COMPLETED, CANCELLED;

    /** Statuses that hold a room for their date range. */
    public boolean blocksRoom() {
        return this == PENDING || this == CONFIRMED || this == CHECKED_IN;
    }
}
