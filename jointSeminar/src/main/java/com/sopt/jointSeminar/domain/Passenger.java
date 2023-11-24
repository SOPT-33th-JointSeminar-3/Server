package com.sopt.jointSeminar.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Passenger {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;

    private String firstname;
    private String lastname;
    private String gender;
    private LocalDate birth;

//    Naiton 정보 연결?

    @Builder
    public Passenger(String firstname, String lastname, String gender, LocalDate birth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birth = birth;
    }
}
