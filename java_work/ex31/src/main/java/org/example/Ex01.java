package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {

    public static void main(String[] args) {

        Stream.of(11,22,33,44,55,66,77,88,99).forEach(System.out::println);

        Stream.of("So Simple", "Fuck", "You").forEach(System.out::println);

        List list = Arrays.asList("11","22","33","44");
        List list2 = Arrays.asList("11","22","33","44");

        int rs = Stream.of(list, list2).flatMapToInt(strings -> strings.stream().mapToInt(s -> Integer.parseInt((String) s))).sum();

        System.out.println(rs);

    }

}
