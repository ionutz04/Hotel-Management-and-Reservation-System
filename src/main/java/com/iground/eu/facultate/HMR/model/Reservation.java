package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Set;

public record Reservation(@Id Long id, Long guestId, Long roomId, LocalDate checkIn, LocalDate checkOut,
                          int guestCount, ReservationStatus status, PaymentStatus paymentStatus,
                          BigDecimal totalPrice, Instant createdAt, Instant paidAt, boolean reminderSent,
                          @MappedCollection(idColumn = "reservation_id") Set<ReservationServiceItem> services) {

    public Reservation withStatus(ReservationStatus newStatus) {
        return new Reservation(id, guestId, roomId, checkIn, checkOut, guestCount, newStatus, paymentStatus,
                totalPrice, createdAt, paidAt, reminderSent, services);
    }

    public Reservation withPayment(PaymentStatus newPayment, Instant newPaidAt) {
        return new Reservation(id, guestId, roomId, checkIn, checkOut, guestCount, status, newPayment,
                totalPrice, createdAt, newPaidAt, reminderSent, services);
    }

    public Reservation withReminderSent() {
        return new Reservation(id, guestId, roomId, checkIn, checkOut, guestCount, status, paymentStatus,
                totalPrice, createdAt, paidAt, true, services);
    }

    public Reservation withBooking(Long newRoomId, LocalDate newCheckIn, LocalDate newCheckOut, int newGuestCount,
                                   BigDecimal newTotal, Set<ReservationServiceItem> newServices) {
        return new Reservation(id, guestId, newRoomId, newCheckIn, newCheckOut, newGuestCount, status,
                paymentStatus, newTotal, createdAt, paidAt, reminderSent && checkIn.equals(newCheckIn), newServices);
    }
}
