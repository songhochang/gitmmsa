package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Hw01 {

    public static void main(String[] args) {

        int[]arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*20 + 1 - 10);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));

    }

    public static int minValue(int[] arr){

        int min_value = 0;

        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        min_value = arr[0];

        return min_value;

    }

    public static int maxValue(int[] arr){

        int max_value = 0;

        for(int i : arr){
            max_value = arr[arr.length - 1];
        }

        return max_value;

    }

}
