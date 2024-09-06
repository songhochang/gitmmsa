package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex01 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(localDate.getYear(),12,25);
        System.out.println(localDate1);

        System.out.println(localDate1.minusDays(1));
        System.out.println(localDate1.plusDays(2));

    }

}
