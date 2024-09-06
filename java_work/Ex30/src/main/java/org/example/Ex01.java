package org.example;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        String[] arr = {"YOON", "PARK", "ROBOT"};

//        Arrays.stream(arr).forEach(s -> System.out.println("내용 " + s));

        for(String temp : arr){
            System.out.println("내용 " + temp);
        }


    }

}
