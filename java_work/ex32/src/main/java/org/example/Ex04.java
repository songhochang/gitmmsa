package org.example;

import java.time.ZoneId;

public class Ex04 {

    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds().stream().sorted().forEach(System.out::println);

    }

}
