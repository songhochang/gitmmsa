package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

        System.out.println(dtf.format(now));
        System.out.println(dtf1.format(now));

        String result = DateTimeFormatter.ofPattern("MM/dd").format(LocalDateTime.now());
        System.out.println(result);



    }

}
