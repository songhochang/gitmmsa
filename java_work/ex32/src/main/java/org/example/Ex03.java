package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex03 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime f1 = LocalDateTime.of(2025,1,25,11,20);
        LocalDateTime f2 = LocalDateTime.of(2025,1,30,8,20);

        Period period = Period.between(localDateTime.toLocalDate(), f1.toLocalDate());
        System.out.println(period);

        Duration duration = Duration.between(f1.toLocalTime(),f2.toLocalTime());
        System.out.println(duration);

    }

}
