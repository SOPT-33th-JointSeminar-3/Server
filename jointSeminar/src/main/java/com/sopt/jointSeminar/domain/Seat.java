package com.sopt.jointSeminar.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
@Table(name = "seat")
public class Seat implements Comparable<Seat> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    @ManyToOne
    @JoinColumn(name = "flightId")
    private Flight flight;

    private String seatClass;
    private int price;

    @Override
    public int compareTo(Seat seat) {
        if (seat.price < price) {
            return 1;
        } else if (seat.price > price) {
            return -1;
        }
        return 0;
    }
}
