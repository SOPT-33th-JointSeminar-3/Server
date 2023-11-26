package com.sopt.jointSeminar.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "flight")
public class Flight {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;

    private String startNation;
    private String endNation;

    private String startTime; // "HH:mm"
    private String endTime;

    @Embedded
    private List<Seat> seats;

    public String getDurationTime() {
        long hour = 0;
        long min = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

            // 문자열 -> Date -> 밀리세컨즈
            long timeMil1 = sdf.parse(startTime).getTime();
            long timeMil2 = sdf.parse(endTime).getTime();
            long diffMin = (timeMil2 - timeMil1) / (1000 * 60);

            hour = diffMin / 60;
            min = diffMin - hour*60;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return hour+":"+min;
    }
}
