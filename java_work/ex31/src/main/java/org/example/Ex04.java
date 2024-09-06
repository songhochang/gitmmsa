package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04 {

    public static void main(String[] args) {

        Stream<Person> ss = Stream.of(new Person(100,90,80), new Person(90,80,70), new Person(60,70,80));

//        ss.forEach(System.out::println);

        IntStream is = ss.flatMapToInt(person -> IntStream.of(person.getEng(), person.getKor(), person.getMath()));

        System.out.println("total = " + is.sum());

        ss = Stream.of(new Person(100,90,80), new Person(90,80,70), new Person(60,70,80));

        is = ss.flatMapToInt(person -> IntStream.of(person.getEng(), person.getKor(), person.getMath()));

        double avg = is.average().orElse(0);
        System.out.println("avg = " + avg);

    }

}
