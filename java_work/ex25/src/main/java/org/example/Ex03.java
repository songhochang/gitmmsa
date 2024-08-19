package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("TOY", "BOX", "ROBOT");

//        list.add("가능?");  // 불가능

        list = new ArrayList<>(list);

        list.add("가능?"); // 가능

        System.out.println(list);

    }

}
