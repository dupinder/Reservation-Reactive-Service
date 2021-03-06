package com.ds.reservation.services;

import com.ds.reservation.models.Reservation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReservationService {

    Mono<Reservation> getReservation(String id);

    Mono<Reservation> createReservation(Mono<Reservation> reservationMono);

    Mono<Reservation> updateReservation(String id, Mono<Reservation> reservation);

    Mono<Boolean> deleteReservation(String id);

    Flux<Reservation> ListAllReservations();
}
