package com.sopt.jointSeminar.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Nation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nationId;

    private String nationName;
    private String itatCode;
    private String city;
    
//    일대다(항공편) 출발국가


    @Builder
    public Nation(String nationName, String itatCode, String city) {
        this.nationName = nationName;
        this.itatCode = itatCode;
        this.city = city;
    }
}
