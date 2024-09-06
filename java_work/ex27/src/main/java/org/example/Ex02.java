package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {

    public static void main(String[] args) {

        List<Car> list = Arrays.asList(
                new Car("그랜저",3000),
                new Car("티코",30),
                new Car("황마",80)
        );

        for(Car car : list){
            System.out.println(car);
        }

        System.out.println(list.get(0));

        Collections.sort(list);
        System.out.println();

        for(Car car : list){
            System.out.println(car);
        }

    }

}
