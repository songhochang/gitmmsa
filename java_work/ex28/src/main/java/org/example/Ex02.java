package org.example;

import java.util.*;

public class Ex02 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","BBB","DDDD","Z","");
        list = new ArrayList<>(list);

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

        System.out.println(list);

    }

}
