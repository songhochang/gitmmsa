package org.example.aa;

import java.util.Arrays;

public class MRTest {

    public static void main(String[] args) {

        int[] arr = new int[6];

        for(int k = 0; k < 5; k++){
            for(int i = 0; i < arr.length; i++){
                arr[i] = (int)(Math.random()*45+1);
                for(int j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        i--;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }

//        System.out.println(Arrays.toString(arr));

//        int temp = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length; j++){
//                if(arr[i] < arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

    }

}
