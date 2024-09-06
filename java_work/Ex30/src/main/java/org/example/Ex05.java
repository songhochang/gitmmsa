package org.example;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","CCC","BBB","DDDDD");

        String result = list.stream().reduce("",(a,b)->{
            if(a.length() > b.length()) return a;
            else return b;
        });

        System.out.println(result);

        result = list.stream().reduce("",(a,b)-> a+b);

        System.out.println(result);
    }

}
