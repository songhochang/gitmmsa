package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] brr = arr;
        brr[0] = 2;

        int a = 10;
        int b = a;

        b = b - 5;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        System.out.println(a);
        System.out.println(b);

    }
}