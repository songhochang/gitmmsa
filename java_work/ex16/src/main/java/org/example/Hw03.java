package org.example;

import java.util.Arrays;

public class Hw03 {

    public static void main(String[] args) {

        int[][] arr = new int[5][3];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                arr[i][j] += (int)(Math.random()*10 + 1);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        changArr(arr);

    }

    public static void changArr(int[][] arr){

        int[] arr1 = arr[arr.length - 1];

        for(int i = arr.length - 1; i >= 1; i--){
            arr[i] = arr[i - 1];
        }

//        System.out.println(Arrays.toString(arr1));

        arr[0] = arr1;

        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}
