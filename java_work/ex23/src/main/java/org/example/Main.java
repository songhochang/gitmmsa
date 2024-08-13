package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person[] parr = {new Person("aaaaa",40), new Person("b",20), new Person("cccc",50), new Person("dd", 80)};

        Arrays.sort(parr);

        System.out.println(Arrays.toString(parr));

    }
}