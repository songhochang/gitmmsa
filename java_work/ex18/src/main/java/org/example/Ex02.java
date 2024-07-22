package org.example;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args){

        int arr[][] = {{1, 2, 3}, {4,5,6}, {7,8,9}};

        int temp1[] = arr[0];
        int temp2[] = arr[1];
        int temp3[] = arr[2];

        arr[0] = temp3;
        arr[1] = temp1;
        arr[2] = temp2;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

//        System.out.println("temp1");
//        System.out.println(Arrays.toString(temp1));

    }

}
